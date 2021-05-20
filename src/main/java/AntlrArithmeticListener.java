import java.util.Stack;

public class AntlrArithmeticListener extends ArithmeticBaseListener{
    private Stack<Integer> stack = new Stack <Integer>();

    @Override
    public void exitInt(ArithmeticParser.IntContext ctx)
    {
        int i = Integer.parseInt(ctx.INT().getText());
        stack.push(i);
    }
    @Override
    public void exitProg(ArithmeticParser.ProgContext ctx)
    {
        int result = stack.pop();
        System.out.println(result);
    }
    @Override
    public void exitMult(ArithmeticParser.MultContext ctx)
    {
        int r = stack.pop();
        int l = stack.pop();
        String op = ctx.getChild(1).getText();
        int result;
        if (op.equals("*"))
            result = l * r;
        else
            result = l / r;
        stack.push(result);
    }

    @Override
    public void exitAdd(ArithmeticParser.AddContext ctx)
    {
        int r = stack.pop();
        int l = stack.pop();
        String op = ctx.getChild(1).getText();
        int result;
        if (op.equals("+"))
            result = l + r;
        else
            result = l - r;
        stack.push(result);
    }
}
