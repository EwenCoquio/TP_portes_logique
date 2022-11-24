public class Gate_2_input extends Gate {
    //attributs
    protected boolean input1;
    protected boolean input2;
    protected boolean output;

    Gate_2_input(){
    }

    public boolean isInput1() {
        return input1;
    }

    public boolean isInput2() {
        return input2;
    }

    public boolean isOutput() {
        return output;
    }

    public void setInput1(boolean input1) {
        this.input1 = input1;
    }

    public void setInput2(boolean input2) {
        this.input2 = input2;
    }

    public void activate(){
    }
    public String toString(){
        return "entree 1 : " + input1 +"\n" +"entree 2 : "+ input2;
    }

}
