import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class AntlrArithmeticVisitor extends ArithmeticBaseVisitor<Variable> {

    private Map<String, Variable> memory = new HashMap<String, Variable>(); //Memory for variables
    private Map<String, ArithmeticParser.Func_defContext> funcDefs = new HashMap<String, ArithmeticParser.Func_defContext>(); //Memory for function definitions

    //string name = "George"
    @Override
    public Variable visitAssign(ArithmeticParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        Variable value = this.visit(ctx.expr());
        return memory.put(id, value);
    }

    public Variable visitPrint(ArithmeticParser.PrintContext ctx) {
        Variable var = this.visit(ctx.expr());
        TYPE varType = var.getVarType();
        switch (varType) {
            case INT:
                System.out.println(var.getVarInt());
                return var;
            case STRING:
                System.out.println(var.getVarString());
                return var;
            case BOOL:
                System.out.println(var.getVarBool());
                return var;
        }
        return var;
    }

    //Retrieve value of variable
    @Override
    public Variable visitIdAtom(ArithmeticParser.IdAtomContext ctx) {
        String id = ctx.getText();
        Variable value = memory.get(id);
        if (value == null) {
            throw new RuntimeException("no such variable: " + id);
        }
        return value;
    }

    public Variable visitIntAtom(ArithmeticParser.IntAtomContext ctx) {
        Variable number = new Variable();
        number.setVarInt(Integer.parseInt(ctx.getText()));
        return number;
    }

    @Override
    public Variable visitStringAtom(ArithmeticParser.StringAtomContext ctx) {
        Variable word = new Variable();
        word.setVarString(ctx.getText());
        return word;
    }

    @Override
    public Variable visitBoolAtom(ArithmeticParser.BoolAtomContext ctx) {
        Variable bool = new Variable();
        String text = ctx.getText();
        Boolean output = false;
        if (text.equals("true") ) {
            output = true;
        }
        bool.setVarBool(output);
        return bool;
    }

    public Variable visitPowExpr(ArithmeticParser.PowExprContext ctx) {
        Variable left = this.visit(ctx.expr(0));
        Variable right = this.visit(ctx.expr(1));
        Integer power = (int) Math.pow(left.getVarInt(), right.getVarInt());
        Variable result = new Variable();
        result.setVarInt(power);
        return result;
    }

    public Variable visitMultExpr(ArithmeticParser.MultExprContext ctx) {
        Variable left = this.visit(ctx.expr(0));
        Variable right = this.visit(ctx.expr(1));

        String op = ctx.getChild(1).getText();

        int number = 0;
        Variable result = new Variable();

        switch (op) {
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

    public Variable visitAddExpr(ArithmeticParser.AddExprContext ctx) {
        Variable left = this.visit(ctx.expr(0));
        Variable right = this.visit(ctx.expr(1));
        Variable result = new Variable();

        String op = ctx.getChild(1).getText();

        switch (op) {
            case "+":
                try {
                    result.concatVariables(left, right);
                } catch (Exception e) {
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

    public Variable visitFactExpr(ArithmeticParser.FactExprContext ctx) {
        Variable number = this.visit(ctx.expr());
        Integer numberAsInt = number.getVarInt();
        Integer resultAsInt = fact(numberAsInt);
        number.setVarInt(resultAsInt);
        return number;
    }

    public Variable visitComparisonExpr(ArithmeticParser.ComparisonExprContext ctx) {
        Variable left = this.visit(ctx.expr(0));
        Variable right = this.visit(ctx.expr(1));

        Integer leftAsInt = left.getVarInt();
        Integer rightAsInt = right.getVarInt();

        Variable result = new Variable();

        String op = ctx.getChild(1).getText();

        switch (op) {
            case ">":
                if (leftAsInt > rightAsInt) {
                    result.setVarBool(true);
                } else {
                    result.setVarBool(false);
                }
                break;
            case "<":
                if (leftAsInt < rightAsInt) {
                    result.setVarBool(true);
                } else {
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
                if (leftAsInt >= rightAsInt) {
                    result.setVarBool(true);
                } else {
                    result.setVarBool(false);
                }
                break;
            case "==":
                if (leftAsInt == rightAsInt) {
                    result.setVarBool(true);
                } else {
                    result.setVarBool(false);
                }
                break;
            case "!=":
                if (leftAsInt != rightAsInt) {
                    result.setVarBool(true);
                } else {
                    result.setVarBool(false);
                }
                break;
        }
        return result;

    }

    public Variable visitAndExpr(ArithmeticParser.AndExprContext ctx) {
        Variable left = this.visit(ctx.expr(0));
        Variable right = this.visit(ctx.expr(1));

        Boolean leftAsBool = left.getVarBool();
        Boolean rightAsBool = right.getVarBool();

        Boolean resultAsBool = leftAsBool && rightAsBool;
        Variable result = new Variable();
        result.setVarBool(resultAsBool);
        return result;

    }

    public Variable visitOrExpr(ArithmeticParser.OrExprContext ctx) {
        Variable left = this.visit(ctx.expr(0));
        Variable right = this.visit(ctx.expr(1));

        Boolean leftAsBool = left.getVarBool();
        Boolean rightAsBool = right.getVarBool();

        Boolean resultAsBool = leftAsBool || rightAsBool;
        Variable result = new Variable();
        result.setVarBool(resultAsBool);
        return result;

    }

    // expr overrides
    @Override
    public Variable visitParExpr(ArithmeticParser.ParExprContext ctx) {
        return this.visit(ctx.expr());
    }


    private int fact(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * fact(number - 1);
        }
    }

    public Variable visitIf_stat(ArithmeticParser.If_statContext ctx) {
        List<ArithmeticParser.Condition_blockContext> conditions = ctx.condition_block();

        boolean evaluatedBlock = false;

        for (ArithmeticParser.Condition_blockContext condition : conditions) {

            Variable evaluated = this.visit(condition.expr());

            if (evaluated.getVarBool()) {
                evaluatedBlock = true;
                // evaluate this block whose expr==true
                this.visit(condition.stat_block());
                break;
            }
        }

        if (!evaluatedBlock && ctx.stat_block() != null) {
            // evaluate the else-stat_block (if present == not null)
            this.visit(ctx.stat_block());
        }
        Variable throwaway = new Variable();
        return throwaway;
    }

    public Variable visitWhile_stat(ArithmeticParser.While_statContext ctx){
        Variable value = this.visit(ctx.expr());

        while(value.getVarBool()){

            //evaluate block
            this.visit(ctx.stat_block());

            //evaluate expression
            value = this.visit(ctx.expr());
        }
        Variable throwaway = new Variable();
        return throwaway;
    }

    public Variable visitFunc_def(ArithmeticParser.Func_defContext ctx)
    {
        funcDefs.put(ctx.ID().getText(), ctx); // Add the function name as key in the function memory and the function details as the value
        Variable throwaway = new Variable(); //Irrelevant variable since we always have to return from methods
        return throwaway;

    }

    public Variable visitFunc_call(ArithmeticParser.Func_callContext ctx) throws Exception {
        ArithmeticParser.Func_defContext function = funcDefs.get(ctx.ID().getText()); //Get the function definition from the function memory
        List<ArithmeticParser.StatContext> statements = function.stat_block().stat(); //Get the function statements from the function definition
        if (function.arguments().getChildCount() != ctx.arguments().getChildCount()) //If number of call arguments does not match number of definition arguments
        {
            throw new Exception("Number of call and definition arguments does not match"); //Throw exception
        }
        for (int i = 0; i < function.arguments().getChildCount(); i++) //Loop through all the arguments of the function definition
        {
            Variable var = this.visit(ctx.arguments().getChild(i)); //Get the value of the variable in the function call
            memory.put(function.arguments().getChild(i).getText(), var); //Add the function definition argument as key and value of function call variable as value
        }
        Variable statementResult = new Variable();
        for (ArithmeticParser.StatContext statement : statements) //Loop through all statements
        {
            statementResult = this.visit(statement); //Execute all statements
        }
        for (int i = 0; i < function.arguments().getChildCount(); i++)
        {
            memory.remove(function.arguments().getChild(i).getText()); //Delete all local variables
        }
        return statementResult; //function return statement
    }

    public Variable visitReturn_(ArithmeticParser.Return_Context ctx)
    {
        Variable value = this.visit(ctx.expr());
        return value;
    }



}
