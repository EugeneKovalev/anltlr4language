import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import model.Function;
import model.FunctionMemory;
import model.Variable;
import model.VariableMemory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MyParser {
    private final String STR_TYPE = "String";
    private final String ARR_TYPE = "String []";
    private final String CHAR_TYPE = "char";


    private VariableMemory variableMemory;
    private FunctionMemory functionMemory;
    public static File outputFile;
    public static File functionFile;
    public static File funcClasses;

    public MyParser() {
        variableMemory = new VariableMemory();
        functionMemory = new FunctionMemory();
        //System.out.println("INIT");
        outputFile = new File("C:/Users/OVERLORD/Documents/Java Eclipse/ANTLR Vetrix/target/generated-sources/antlr4/Output.java");
        functionFile = new File("C:/Users/OVERLORD/Documents/Java Eclipse/ANTLR Vetrix/target/generated-sources/antlr4/Output.java");
        funcClasses = new File("C:/Users/OVERLORD/Documents/Java Eclipse/ANTLR Vetrix/target/generated-sources/antlr4/FuncClasses.java");
        writeInFile("public class FuncClasses{", funcClasses);
        writeInFile("public class Output{ \n public Output(){ \n", outputFile);
        
        //System.out.println(outputFile);
    }

    public void parse(File file) {
        prepareFiles();
        VetrixLexer lexer = null;
        try {
            lexer = new VetrixLexer(new ANTLRFileStream(file.getAbsolutePath()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        TokenStream str = new CommonTokenStream(lexer);
        VetrixParser p = new VetrixParser(str);
        p.runProgram();
    }

    public void prepareFiles() {
        cleanFile(functionFile);
        cleanFile(outputFile);
        writeInFile("import static func.Functions.*;", outputFile);
        writeInFile("public class Output {", outputFile);
        writeInFile("  public static void main(String[] args) {", outputFile);
        writeInFile("package func;\n public class Functions {", functionFile);
    }

    public void closeFiles() {
        writeInFile("  }", outputFile);
        writeInFile("}", outputFile);
        writeInFile("}", functionFile);
    }

    private void cleanFile(File file) {
        try {
            FileWriter writer = new FileWriter(file);
            writer.write("");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void makeVariableAssignment(String name, String value, boolean isPrintInOtherFunction) {
        //if (!isPrintInOtherFunction) {
        String type = null;
        try {
            type = switchTypeOfValue(value);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (isArithmetic(value)) {
                List<String> arExpr = parseMath(value);
                //System.out.println(value);
                //System.out.println(arExpr.get(0));
                value = makeMath(arExpr.get(0), arExpr.get(1), arExpr.get(2));
                variableMemory.addVariable(new Variable(name, type, value));
            } else if (isUnar(value)) {
                List<String> unarExpr = parseUnar(value);
                value = makeUnar(unarExpr.get(0), unarExpr.get(1));
                variableMemory.addVariable(new Variable(name, type, value));
            } else
                variableMemory.addVariable(new Variable(name, type, prepareValue(value)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (type.equals(CHAR_TYPE)) {
            type = STR_TYPE;
            value = "String.valueOf(" + value + ")";
        }

        //System.out.println(type + " " + name + " = " + value + ";");
        if (!isPrintInOtherFunction) {
            writeInFile("      " + type + " " + name + " = " + value + ";", outputFile);
        } else writeInFile("      " + type + " " + name + " = " + value + ";", functionFile);
//        }
//        else {
//
//        }
    }

    public void makePrintFunction(String value, boolean isPrintInOtherFunction) {
        System.out.println(value);
        try {
            if (variableMemory.isVariableExists(value))
                value = variableMemory.getValueOfVariable(value);
            if (!isPrintInOtherFunction) {
                writeInFile("    System.out.println(\"" + value + "\");", outputFile);
            } else
                writeInFile("    System.out.println(\"" + value + "\");", funcClasses);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String makeMath(String var1, String math, String var2) {
        String type1 = "";
        String type2 = "";
        try {
            type1 = variableMemory.getTypeOfVariable(var1);
            type2 = variableMemory.getTypeOfVariable(var2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!type1.equals(ARR_TYPE) && !type2.equals(ARR_TYPE)) {
            //String value1 = null;
            //String value2 = null;
            // try {
            //value1 = variableMemory.getValueOfVariable(var1);
            //value2 = variableMemory.getValueOfVariable(var2);
            // } catch (NoVariableException e) {
            //    e.printStackTrace();
            //}
            if (math.equals("+")) return var1 + " + " + var2;
            if (math.equals("/"))
                return var1 + ".replace(" + var2 + ", \"\")";//"\"" + value1.replace(value2, "") + "\"";
            if (math.equals("-")) return "String.valueOf(" + var1 + ".contains(" + var2 + "))";
            ;
            if (math.equals("*")) return "String.valueOf(" + var1 + ".lastIndexOf(" + var2 + "))";
            if (math.equals("=")) return "String.valueOf(" + var1 + ".equals(" + var2 + "))";

        }
        return "Exception";
    }

    public String makeUnar(String var1, String op) {
        String type1 = "";
        try {
            type1 = variableMemory.getTypeOfVariable(var1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!type1.equals(ARR_TYPE)) {

            // try {
            //value1 = variableMemory.getValueOfVariable(var1);
            //value2 = variableMemory.getValueOfVariable(var2);
            // } catch (NoVariableException e) {
            //    e.printStackTrace();
            //}
            if (op.equals("?")) return "String.valueOf(" + var1 + ".length())";
            if (op.contains("[") && op.contains("]")) {
                op = op.replace("[", "").replace("]", "");
                return "String.valueOf(" + var1 + ".charAt(" + op + "))";
            }

        }
        return "Exception";
    }

    private String switchTypeOfValue(String value) throws Exception {
        if (isArithmetic(value)) return STR_TYPE;
        if (isUnar(value)) return STR_TYPE;
        if (isFunction(value)) return STR_TYPE;
        if (value.endsWith("}")) return ARR_TYPE;
        if (value.endsWith("\'")) return CHAR_TYPE;
        if (value.endsWith("\"")) return STR_TYPE;
        else return variableMemory.getTypeOfVariable(value);
    }

    private boolean isArithmetic(String value) {
        return value.contains("+")
                || value.contains("=")
                || value.contains("-")
                || value.contains("/")
                || value.contains("*");
    }

    private boolean isUnar(String value) {
        return value.contains("?") | (value.contains("[") && (value.contains("]")));
    }

    private boolean isFunction(String value) {
        return value.contains("(") && value.contains(")");
    }

    public static void writeInFile(String str, File file) {
        try {
            FileWriter writer = new FileWriter(file, true);
            writer.write(str + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<String> parseMath(String value) {
        List<String> arithmeticExpr = new ArrayList<>();
        Pattern f = Pattern.compile("([\\w|'|\"\\s]+)\\s*([\\+\\*\\/=-])\\s*([\\w'|\"\\s]*)");
        Matcher m = f.matcher(value);
        if (m.matches()) {
            //System.out.println(m.group(1) + m.group(2) + m.group(3) + "Patter ");
            arithmeticExpr.addAll(Arrays.asList(m.group(1), m.group(2), m.group(3)));
        }
        return arithmeticExpr;
    }

    private List<String> parseUnar(String value) {
        List<String> unarExpr = new ArrayList<>();
        Pattern length = Pattern.compile("([\\w|'|\"\\s]+)\\s*([\\?])");
        Pattern getChar = Pattern.compile("([\\w|'|\"\\s]+)\\s*(\\[\\w\\])");
        Matcher m = length.matcher(value);
        if (m.matches()) {
            // System.out.println(m.group(1) + m.group(2) + m.group(3) + "Patter ");
            unarExpr.addAll(Arrays.asList(m.group(1), m.group(2)));

        }
        Matcher g = getChar.matcher(value);
        if (g.matches()) {
            // System.out.println(m.group(1) + m.group(2) + m.group(3) + "Patter ");
            unarExpr.addAll(Arrays.asList(g.group(1), g.group(2)));
        }
        return unarExpr;
    }

    private String prepareValue(String val) {
        val = val.replace("\"", "");
        return val.replace("\'", "");
    }

    public void makeFunctionHeader(String funcId, List<String> args) {
        try {
            functionMemory.addFunction(new Function(funcId, args));
            createInputVarsForFunction(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
        StringBuilder functionSignature = new StringBuilder();
        functionSignature.append("  public static String ").append(funcId).append(" (");
        for (int argL = 0; argL < args.size(); argL++) {
            if (argL == args.size() - 1)
                functionSignature.append("String ").append(args.get(argL));
            else functionSignature.append("String ").append(args.get(argL)).append(", ");
        }
        functionSignature.append(")");
        functionSignature.append("{");
        //writeInFile(functionSignature.toString(), functionFile);
        writeInFile(functionSignature.toString(), funcClasses);
    }

    private void createInputVarsForFunction(List<String> args) {
        for (String var : args) {
            try {
                variableMemory.addVariable(new Variable(var, STR_TYPE, var));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public void makeFunctionReturn(String retId) {
        if (retId.equals(""))
            writeInFile("    return  \"\";", funcClasses);
        else
            writeInFile("    return " + retId + ";", funcClasses);
        writeInFile("  }", funcClasses);
    }

    public void parseFunctionCall(String funcId, List<String> args, boolean isFunction) {
    	System.out.println("func call");
        //if (functionMemory.isFunctionExists(funcId, args.size())) {
            List<String> values = new ArrayList<>();
            try {
                for (String oneArg : args) {
                    values.add(variableMemory.getValueOfVariable(oneArg));
                }
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
            String argsList = args.toString().replace("[", "").replace("]", "");
            if (isFunction)
                writeInFile("      " +  funcId + "(" + argsList + ");", functionFile);
            else
                writeInFile("      FuncClasses." + funcId + "(" + argsList + ");", outputFile);
        //}

//        StringBuilder functionSignature = new StringBuilder();
//        functionSignature.append("  public static String ").append(funcId).append(" (");
//        for (int argL = 0; argL < args.size(); argL++) {
//            if (argL == args.size() - 1)
//                functionSignature.append("String ").append(args.get(argL));
//            else functionSignature.append("String ").append(args.get(argL)).append(", ");
//        }
//        functionSignature.append(")");
//        functionSignature.append("{");
//        writeInFile(functionSignature.toString(), functionFile);
    }

    public void parseCondition(String condition, String value, boolean isFunction) {
        String type;
        try {
            type = switchTypeOfValue(value);
            if (!type.equals(ARR_TYPE)) {
                StringBuilder condHeader = new StringBuilder();
                condHeader.append("     ").append(condition).append(" (").append("\"true\".equals(").append(value).append("))").append(" {");
                if (isFunction)
                    writeInFile(condHeader.toString(), functionFile);
                else
                    writeInFile(condHeader.toString(), outputFile);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void closeCondition(boolean isFunction) {
        if (isFunction)
            writeInFile("   }", functionFile);
        else
            writeInFile("   }", outputFile);

    }

    public void parseFor(String var, String from, String to, String step, boolean isFunction) {
        if (variableMemory.isVariableExists(to)) {
            try {
                to = "Integer.valueOf(" + variableMemory.getValueOfVariable(to) + ")";
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        StringBuilder condHeader = new StringBuilder();
        if (!variableMemory.isVariableExists(var))
            try {
                variableMemory.addVariable(new Variable(var, var, var));
            } catch (Exception e) {
                e.printStackTrace();
            }
        condHeader.append("     for ( int ")
                .append(var)
                .append("= ")
                .append(from)
                .append(";")
                .append(var)
                .append(" < ")
                .append(to)
                .append(";")
                .append(var)
                .append(" += ")
                .append(step)
                .append(") {");
        if (isFunction)
            writeInFile(condHeader.toString(), functionFile);
        else
            writeInFile(condHeader.toString(), outputFile);

    }

}