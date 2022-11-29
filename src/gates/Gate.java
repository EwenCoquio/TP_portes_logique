package gates;

import wires.Wire;

public class Gate extends Actor {
    protected Wire output;

    Gate() {
        output = new Wire();
    }

    public boolean getOutput() {
        return output.getSignal();
    }

    public void activate() {
    }
}
