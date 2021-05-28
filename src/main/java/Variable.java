public class Variable {
    private String varString;
    private Integer varInt;
    private Boolean varBool;

    public void setVarBool(Boolean varBool) {
        this.varBool = varBool;
    }

    public Boolean getVarBool() {
        return varBool;
    }

    public void setVarInt(Integer varInt) {
        this.varInt = varInt;
    }

    public Integer getVarInt() {
        return varInt;
    }

    public void setVarString(String varString) {
        this.varString = varString;
    }

    public String getVarString() {
        return varString;
    }
    public String concatVariables(Variable v, Variable z){
        if(v.getVarString() != null && z.getVarString() != null){
            String x1 = v.getVarString().substring(1, v.getVarString().length() - 1);
            String x2 = z.getVarString().substring(1, z.getVarString().length() - 1);
            return x1 + x2;
        }
        return v.getVarInt() + z.getVarInt().toString();
    }
    public String printCon(){
        if(this.varString != null){
            return this.getVarString();
        }else{
            if(this.varBool != null){
                return this.getVarBool().toString();
            }
        }
        return this.getVarInt().toString();
    }
}
