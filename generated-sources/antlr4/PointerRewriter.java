import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;


public class PointerRewriter extends ADTCBaseListener{

	TokenStreamRewriter rewriter;
	ADTCParser parser;
	
	public PointerRewriter(ADTCParser parser, TokenStream tokens){
		
		rewriter = new TokenStreamRewriter(tokens);
		this.parser = parser;
		
	}
	
	public void enterDeclaration(ADTCParser.DeclarationContext ctx) { 
			
			TokenStream tokens = parser.getTokenStream();
			
			String pointerReplace = tokens.getText(ctx.getRuleContext());
			pointerReplace = pointerReplace.replace("*", "");
			rewriter.replace(ctx.start,ctx.stop,pointerReplace);
	}
}
