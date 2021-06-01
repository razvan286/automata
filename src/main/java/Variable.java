enum TYPE {
    INT,
    STRING,
    BOOL
}

public class Variable {
    private String varString;
    private Integer varInt;
    private Boolean varBool;
    private TYPE varType;


    public TYPE getVarType() {
        return varType;
    }

    public void setVarType(TYPE type) {
        this.varType = type;
    }

    public void setVarBool(Boolean varBool) {
        this.varBool = varBool;
        this.varType = TYPE.BOOL;
    }

    public Boolean getVarBool() {
        return varBool;
    }

    public void setVarInt(Integer varInt) {
        this.varInt = varInt;
        this.varType = TYPE.INT;
    }

    public Integer getVarInt() {
        return varInt;
    }

    public void setVarString(String varString) {
        this.varString = varString;
        this.varType = TYPE.STRING;
    }

    public String getVarString() {
        return varString;
    }

    public void concatVariables(Variable v, Variable z) throws Exception {
        TYPE vType = v.getVarType();
        TYPE zType = z.getVarType();
        if (vType != zType) {
            throw new Exception("Type error: Type mismatch");
        }
        if (v.getVarString() != null && z.getVarString() != null) {
            String x1 = v.getVarString().substring(1, v.getVarString().length() - 1);
            String x2 = z.getVarString().substring(1, z.getVarString().length() - 1);
            String result = x1 + x2;
            this.varType = TYPE.STRING;
            this.varString = result;
        }
        Integer sum = v.getVarInt() + z.getVarInt();
        this.varInt = sum;
        this.varType = TYPE.INT;
    }

    public String printCon() {
        if (this.varString != null) {
            return this.getVarString();
        } else {
            if (this.varBool != null) {
                return this.getVarBool().toString();
            }
        }
        return this.getVarInt().toString();
    }
}
