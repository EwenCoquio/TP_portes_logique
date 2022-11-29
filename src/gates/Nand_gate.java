package gates;

import wires.Wire;

public class Nand_gate extends Gate_2_input {
    public Nand_gate() {
    }
    public Nand_gate(boolean i1, boolean i2) {

    }

    @Override
    public void activate() {
        this.output.setSignal(!(this.input1.getSignal() & this.input2.getSignal()));
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "sortie : " + this.output;
    }
}
