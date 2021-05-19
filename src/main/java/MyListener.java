import org.antlr.v4.runtime.ParserRuleContext;

public class MyListener  extends ArithmeticBaseListener{
    @Override public void enterEveryRule(ParserRuleContext ctx) {  //see ArithmericBaseListener for allowed functions
        System.out.println("rule entered: " + ctx.getText());      //code that executes per rule
    }
}
