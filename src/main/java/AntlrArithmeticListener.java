import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class AntlrArithmeticListener extends ArithmeticBaseListener{
    private Stack<Integer> stack = new Stack <Integer>();
    Map<String, Integer> memory = new HashMap<String, Integer>();

    private Stack<Variable> stackVar = new Stack<>();
    private Map<String, Variable> memoryVar = new HashMap<>();

    @Override public void exitID(ArithmeticParser.IDContext ctx)
    {
        //int number = memory.get(ctx.ID().getText());
        Variable value = memoryVar.get(ctx.ID().getText());
        stackVar.push(value);
        //stack.push(number);
    }
    @Override public void exitString(ArithmeticParser.StringContext ctx)
    {
        Variable value = memoryVar.get(ctx.STRING().getText());
        stackVar.push(value);
    }


    @Override public void exitVar(ArithmeticParser.VarContext ctx)
    {
        String id = ctx.ID().getText(); // id is left-hand side of '='
        //int value = stack.pop(); // compute value of expression on right
        Variable value = stackVar.pop();
        //memory.put(id, value); // store it in our memory
        memoryVar.put(id, value);
    }

    @Override public void exitPrint(ArithmeticParser.PrintContext ctx)
    {
        Variable res = stackVar.pop();
        //Field field = Variable.class.getField("varInt");
        if (res.getVarInt() instanceof Integer){
            System.out.println(res.getVarInt());
        }
        else{
            if (res.getVarString() instanceof String){
                System.out.println(res.getVarString());
            }
        }

        //int result = stack.pop();
        //System.out.println(result);

    }

    @Override
    public void exitPow(ArithmeticParser.PowContext ctx)
    {
        Variable rV = stackVar.pop();
        Variable lV = stackVar.pop();
        int result = (int) Math.pow(lV.getVarInt(), rV.getVarInt());
        //int r = stack.pop();
        //int l = stack.pop();
        //int result = (int) Math.pow(l, r);
        Variable res = new Variable();
        res.setVarInt(result);
        //stack.push(result);
        stackVar.push(res);
    }

    @Override
    public void exitInt(ArithmeticParser.IntContext ctx)
    {
        Variable iV = new Variable();
        iV.setVarInt(Integer.parseInt(ctx.INT().getText()));
        //int i = Integer.parseInt(ctx.INT().getText());
        //stack.push(iV);
        stackVar.push(iV);
    }

    @Override
    public void exitMult(ArithmeticParser.MultContext ctx)
    {
        Variable rV = stackVar.pop();
        Variable lV = stackVar.pop();

        //int r = stack.pop();
        //int l = stack.pop();
        String op = ctx.getChild(1).getText();
        int result;
        /*
        if (op.equals("*"))
            result = l * r;
        else
            result = l / r;
        */

        if (op.equals("*"))
            result = lV.getVarInt() * rV.getVarInt();
        else
            result = lV.getVarInt() / rV.getVarInt();
        //stack.push(result);
        Variable res = new Variable();
        res.setVarInt(result);
        stackVar.push(res);
    }

    @Override
    public void exitAdd(ArithmeticParser.AddContext ctx)
    {
        Variable rV = stackVar.pop();
        Variable lV = stackVar.pop();

        //int r = stack.pop();
        //int l = stack.pop();

        String op = ctx.getChild(1).getText();
        int result;
        /*if (op.equals("+"))
            result = l + r;
        else
            result = l - r;*/
        if (op.equals("+"))
            result = lV.getVarInt() + rV.getVarInt();
        else
            result = lV.getVarInt() - rV.getVarInt();
        Variable res = new Variable();
        res.setVarInt(result);
        //stack.push(result);
        stackVar.push(res);
    }

    @Override
    public void exitFact(ArithmeticParser.FactContext ctx)
    {
        Variable numberV = stackVar.pop();
        //int number = stack.pop();
        //int result = fact(number);
        int result = fact(numberV.getVarInt());
        Variable res = new Variable();
        res.setVarInt(result);
        //stack.push(result);
        stackVar.push(res);
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
