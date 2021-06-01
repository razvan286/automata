import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class AntlrArithmeticListener extends ArithmeticBaseListener{
    private Stack<Variable> stackVar = new Stack<>();
    private Map<String, Variable> memoryVar = new HashMap<>();

    @Override public void exitAssign(ArithmeticParser.AssignContext ctx)
    {
//        Variable value = memoryVar.get(ctx.ID().getText());
        Variable value = memoryVar.get(ctx.expr().getText());
        stackVar.push(value);
    }
    @Override public void exitStringAtom(ArithmeticParser.StringAtomContext ctx)
    {
        Variable iV = new Variable();
        iV.setVarString(ctx.STRING().getText());
        stackVar.push(iV);
    }
    @Override public void exitBoolAtom(ArithmeticParser.BoolAtomContext ctx)
    {
        Variable iV = new Variable();
        iV.setVarBool(Boolean.parseBoolean(ctx.BOOL().getText()));
        stackVar.push(iV);
    }


    @Override public void exitVar(ArithmeticParser.VarContext ctx)
    {
        String id = ctx.ID().getText(); // id is left-hand side of '='
        Variable value = stackVar.pop();  // compute value of expression on right
        memoryVar.put(id, value);  // store it in our memory
    }

    @Override public void exitPrint(ArithmeticParser.PrintContext ctx)
    {
        Variable res = stackVar.pop();
        System.out.println(res.printCon());
    }

    @Override
    public void exitPowExpr(ArithmeticParser.PowExprContext ctx)
    {
        Variable rV = stackVar.pop();
        Variable lV = stackVar.pop();
        int result = (int) Math.pow(lV.getVarInt(), rV.getVarInt());
        Variable res = new Variable();
        res.setVarInt(result);
        stackVar.push(res);
    }

    @Override
    public void exitIntAtom(ArithmeticParser.IntAtomContext ctx)
    {
        Variable iV = new Variable();
        iV.setVarInt(Integer.parseInt(ctx.INT().getText()));
        stackVar.push(iV);
    }

    @Override
    public void exitMultExpr(ArithmeticParser.MultExprContext ctx)
    {
        Variable rV = stackVar.pop();
        Variable lV = stackVar.pop();
        String op = ctx.getChild(1).getText();
        int result;
        if (op.equals("*"))
            result = lV.getVarInt() * rV.getVarInt();
        else
            result = lV.getVarInt() / rV.getVarInt();

        Variable res = new Variable();
        res.setVarInt(result);
        stackVar.push(res);
    }

    @Override
    public void exitAddExpr(ArithmeticParser.AddExprContext ctx){
        Variable variable = new Variable();
        Variable rV = stackVar.pop();
        Variable lV = stackVar.pop();

        String op = ctx.getChild(1).getText();
        String result = new String();
        if (op.equals("+")) {
            try{
                result = variable.concatVariables(lV, rV);
            }catch(Exception e){
                System.out.println(e);
            }

        }
        else{
            Integer dif = lV.getVarInt() - rV.getVarInt();
            result = dif.toString();
        }

        Variable res = new Variable();
        res.setVarString(result);
        stackVar.push(res);
    }

    @Override
    public void exitFactExpr(ArithmeticParser.FactExprContext ctx)
    {
        Variable numberV = stackVar.pop();

        int result = fact(numberV.getVarInt());
        Variable res = new Variable();
        res.setVarInt(result);
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
