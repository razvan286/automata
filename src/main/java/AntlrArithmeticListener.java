import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class AntlrArithmeticListener extends ArithmeticBaseListener{
    private Stack<Integer> stack = new Stack <Integer>();
    Map<String, Integer> memory = new HashMap<String, Integer>();

    @Override public void exitID(ArithmeticParser.IDContext ctx)
    {
        int number = memory.get(ctx.ID().getText());
        stack.push(number);
    }


    @Override public void exitVar(ArithmeticParser.VarContext ctx)
    {
        String id = ctx.ID().getText(); // id is left-hand side of '='
        int value = stack.pop(); // compute value of expression on right
        memory.put(id, value); // store it in our memory
    }

    @Override public void exitPrint(ArithmeticParser.PrintContext ctx)
    {
        int result = stack.pop();
        System.out.println(result);
    }

    @Override
    public void exitPow(ArithmeticParser.PowContext ctx)
    {
        int r = stack.pop();
        int l = stack.pop();
        int result = (int) Math.pow(l, r);
        stack.push(result);
    }

    @Override
    public void exitInt(ArithmeticParser.IntContext ctx)
    {
        int i = Integer.parseInt(ctx.INT().getText());
        stack.push(i);
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

    @Override
    public void exitFact(ArithmeticParser.FactContext ctx)
    {
        int number = stack.pop();
        int result = fact(number);
        stack.push(result);
    }

    private int fact(int number)
    {
        if (number == 0)
        {
            return 1;
        }
        else
        {
            return number * fact(number-1);
        }
    }
}
