package gates;

import wires.Wire;

import java.lang.*;

public class Not_gate extends Gate {
    //attributs
    protected Wire input;

    public Not_gate() {
        input = new Wire();
    }

    public Not_gate(Boolean signal) {
        input = new Wire(signal);
    }

    public boolean isInput() {
        return input.getSignal();
    }

    public void setInput(Wire input) {
        this.input = input;
    }

    public void activate() {
        this.output.setSignal(!this.input.getSignal());
    }

    public String toString() {
        return Boolean.toString(this.output.getSignal());
    }
}
