import org.antlr.v4.runtime.*;
public class EntryPoint {
	
	public static void main( String[] args) throws Exception 
    {
        //ANTLRInputStream input = new ANTLRInputStream("");
		ANTLRInputStream input = new ANTLRInputStream(""
				+ "var1=2 "
				+ "var1=7 "
				+ "var2=|(([1,2,3]*-10)*<Number var1>)| "
				+ "var1=[4,8,15,16,23,42] "
				+ "var3=|([1,2,3] + ((([4,5,6] * 0) + [1,1,1]) * [10,10,-10]))|"
				+ "print(var2) "
				+ "print(var1) "
				+ "print(var3) "
				+ "var1=(<Vector var2>*<Vector var3>)"
				+ "print(var2) "
				+ "print(var1) "
				+ "print(var3)");
        VetrixLexer lexer = new VetrixLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        VetrixParser parser = new VetrixParser(tokens);
        System.out.println(parser.runProgram());
    }
}