import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class FinalInputTokens {
	
	String inputFile="";
	
	public FinalInputTokens(String inputFile){
		
		this.inputFile=inputFile;
	}
	
	public String final_tokens() throws IOException{
		
		InputStream is = new FileInputStream(this.inputFile);
		
		/*pointer rewriter*/
		ANTLRInputStream input = new ANTLRInputStream(is);
		
		ADTCLexer lexer = new ADTCLexer(input);
		
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		ADTCParser parser = new ADTCParser(tokens);
		
		ParseTreeWalker walker = new ParseTreeWalker();
		
		ParseTree tree = parser.header();
		
		PointerRewriter tes = new PointerRewriter(parser, tokens);
		
		walker.walk(tes, tree);
	
		/*typedef rewriter*/		
		
		ANTLRInputStream input1 = new ANTLRInputStream(tes.rewriter.getText());
		
		ADTCLexer lexer1 = new ADTCLexer(input1);
		
		CommonTokenStream tokens1 = new CommonTokenStream(lexer1);
		
		ADTCParser parser1 = new ADTCParser(tokens1);
		
		ParseTreeWalker walker1 = new ParseTreeWalker();
		
		ParseTree tree1 = parser1.header();
		
		TokensRewriter tes1 = new TokensRewriter(parser1, tokens1);
		
		walker1.walk(tes1, tree1);
		
		/*rewriter parameterdeclaration*/
		
		ANTLRInputStream input2 = new ANTLRInputStream(tes1.rewriter.getText());
		
		ADTCLexer lexer2 = new ADTCLexer(input2);
		
		CommonTokenStream tokens2 = new CommonTokenStream(lexer2);
		
		ADTCParser parser2 = new ADTCParser(tokens2);
		
		ParseTreeWalker walker2 = new ParseTreeWalker();
		
		ParseTree tree2 = parser2.header();
		
		ParamaterRewriter tes2 = new ParamaterRewriter(parser2, tokens2);
		
		walker2.walk(tes2, tree2);
		
		return tes2.rewriter.getText();
		
	}
	
}
