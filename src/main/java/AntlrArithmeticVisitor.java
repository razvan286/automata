import java.util.HashMap;
import java.util.Map;

public class AntlrArithmeticVisitor extends ArithmeticBaseVisitor<Variable> {

    private Map<String, Variable> memory = new HashMap<String, Variable>();

    //string name = "George"
    @Override
    public Variable visitAssign(ArithmeticParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        Variable value = this.visit(ctx.expr());
        return memory.put(id, value);
    }

    //Retrieve value of variable
    @Override
    public Variable visitIdAtom(ArithmeticParser.IdAtomContext ctx) {
        String id = ctx.getText();
        Variable value = memory.get(id);
        if(value == null) {
            throw new RuntimeException("no such variable: " + id);
        }
        return value;
    }

    public Variable visitIntAtom(ArithmeticParser.IntAtomContext ctx) {
        Variable number = null;
        number.setVarInt(Integer.parseInt(ctx.getText()));
        return number;
    }

    @Override
    public Variable visitStringAtom(ArithmeticParser.StringAtomContext ctx) {
        Variable word = null;
        word.setVarString(ctx.getText());
        return word;
    }

    @Override
    public Variable visitBoolAtom(ArithmeticParser.BoolAtomContext ctx) {
        Variable bool = null;
        String text = ctx.getText();
        Boolean output = false;
        if (text == "true")
        {
            output = true;
        }
        bool.setVarBool(output);
        return bool;
    }

    public Variable visitPowExpr(ArithmeticParser.PowExprContext ctx)
    {
        Variable left = this.visit(ctx.expr(0));
        Variable right = this.visit(ctx.expr(1));
        Integer power = (int) Math.pow(left.getVarInt(), right.getVarInt());
        Variable result = null;
        result.setVarInt(power);
        return result;
    }

    public Variable visitMultExpr(ArithmeticParser.MultExprContext ctx)
    {
        Variable left = this.visit(ctx.expr(0));
        Variable right = this.visit(ctx.expr(1));

        String op = ctx.getChild(1).getText();

        int number = 0;
        Variable result = null;

        switch(op)
        {
            case "*":
                number = left.getVarInt() * right.getVarInt();
                break;
            case "/":
                number = left.getVarInt() / right.getVarInt();
                break;
        }
        result.setVarInt(number);
        return result;
    }

    public Variable visitAddExpr(ArithmeticParser.AddExprContext ctx)
    {
        Variable left = this.visit(ctx.expr(0));
        Variable right = this.visit(ctx.expr(1));
        Variable result = new Variable();

        String op = ctx.getChild(1).getText();

        switch(op){
            case "+":
                try {
                    result.concatVariables(left, right);
                }
                catch (Exception e){
                    System.out.println(e);
                }
                break;
            case "-":
                Integer subtract = left.getVarInt() - right.getVarInt();
                result.setVarInt(subtract);
                break;
        }
        return result;
    }

    public Variable visitFactExpr(ArithmeticParser.FactExprContext ctx)
    {
        Variable number = this.visit(ctx.expr());
        Integer numberAsInt = number.getVarInt();
        Integer resultAsInt = fact(numberAsInt);
        number.setVarInt(resultAsInt);
        return number;
    }

    public Variable visitComparisonExpr(ArithmeticParser.ComparisonExprContext ctx)
    {
        Variable left = this.visit(ctx.expr(0));
        Variable right = this.visit(ctx.expr(1));

        Integer leftAsInt = left.getVarInt();
        Integer rightAsInt = right.getVarInt();

        Variable result = null;

        String op = ctx.getChild(1).getText();

        switch(op) {
            case ">":
                if (leftAsInt > rightAsInt)
                {
                    result.setVarBool(true);
                }
                else
                {
                    result.setVarBool(false);
                }
                break;
            case "<":
                if (leftAsInt < rightAsInt)
                {
                    result.setVarBool(true);
                }
                else
                {
                    result.setVarBool(false);
                }
                break;
            case "<=":
                if (leftAsInt <= rightAsInt) {
                    result.setVarBool(true);
                } else {
                    result.setVarBool(false);
                }
                break;
            case ">=":
                if (leftAsInt >= rightAsInt)
                {
                    result.setVarBool(true);
                }
                else
                {
                    result.setVarBool(false);
                }
                break;
            case "==":
                if (leftAsInt == rightAsInt)
                {
                    result.setVarBool(true);
                }
                else
                {
                    result.setVarBool(false);
                }
                break;
            case "!=":
                if (leftAsInt != rightAsInt)
                {
                    result.setVarBool(true);
                }
                else
                {
                    result.setVarBool(false);
                }
                break;
        }
        return result;

    }

    public Variable visitAndExpr(ArithmeticParser.AndExprContext ctx)
    {
        Variable left = this.visit(ctx.expr(0));
        Variable right = this.visit(ctx.expr(1));

        Boolean leftAsBool = left.getVarBool();
        Boolean rightAsBool = right.getVarBool();

        Boolean resultAsBool = leftAsBool && rightAsBool;
        Variable result = null;
        result.setVarBool(resultAsBool);
        return result;

    }

    public Variable visitOrExpr(ArithmeticParser.OrExprContext ctx)
    {
        Variable left = this.visit(ctx.expr(0));
        Variable right = this.visit(ctx.expr(1));

        Boolean leftAsBool = left.getVarBool();
        Boolean rightAsBool = right.getVarBool();

        Boolean resultAsBool = leftAsBool || rightAsBool;
        Variable result = null;
        result.setVarBool(resultAsBool);
        return result;

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

    /*    public void exitAddExpr(ArithmeticParser.AddExprContext ctx){
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
    }*/




}
