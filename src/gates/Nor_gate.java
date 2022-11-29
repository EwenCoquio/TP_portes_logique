package gates;

public class Nor_gate extends Gate_2_input {
    public Nor_gate() {

    }

    @Override
    public void activate() {
        this.output.setSignal(!(this.input1.getSignal() | this.input2.getSignal()));
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "sortie : " + this.output;
    }
}
