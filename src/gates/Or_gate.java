package gates;

import wires.Wire;

public class Or_gate extends Gate_2_input {
    public Or_gate() {
    }
    public Or_gate(Boolean i1, Boolean i2) {
        input1 = new Wire(i1);
        input2 = new Wire(i2);
    }

    @Override
    public void activate() {
        this.output.setSignal(this.input1.getSignal() || this.input2.getSignal());
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "sortie : " + this.output;
    }
}
