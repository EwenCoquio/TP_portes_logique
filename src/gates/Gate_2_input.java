package gates;

import wires.Wire;

public class Gate_2_input extends Gate {
    //attributs
    protected Wire input1;
    protected Wire input2;

    public Gate_2_input() {
        input1 = new Wire();
        input2 = new Wire();
    }

    public Gate_2_input(boolean i1, boolean i2) {
        input1 = new Wire(i1);
        input2 = new Wire(i2);
    }

    public boolean getInput1() {
        return input1.getSignal();
    }

    public boolean getInput2() {
        return input2.getSignal();
    }


    public void setInput1(Wire input1) {
        this.input1 = input1;
    }

    public void setInput2(Wire input2) {
        this.input2 = input2;
    }

    public void activate() {
    }

    public String toString() {
        return "entree 1 : " + input1 + "\n" + "entree 2 : " + input2;
    }

}
