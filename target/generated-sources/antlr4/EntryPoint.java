import org.antlr.v4.runtime.*;
public class EntryPoint {
	
	public static void main( String[] args) throws Exception 
    {
        ANTLRInputStream input = new ANTLRInputStream("[1,2,3] + ((([4,5,6] * 0) + [1,1,1]) * [10,10,-10])");
        VetrixLexer lexer = new VetrixLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        VetrixParser parser = new VetrixParser(tokens);
        //System.out.println(parser.listParse().value);
        System.out.println(parser.calculateVectors().values);
        //System.out.println(parser.eval().value);
    }
}