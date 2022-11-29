package wires;

import gates.Actor;
import gates.Gate;
import gates.Gate_2_input;
import gates.Not_gate;

import java.util.ArrayList;

public class Wire extends Actor {

    protected boolean signal;
    protected ArrayList<Integer> inputSignals;
    protected ArrayList<Gate> connections;

    public Wire() {
        inputSignals = new ArrayList<>();
        connections = new ArrayList<>();
    }

    public Wire(boolean si) {
        this.signal = si;
    }

    public boolean getSignal() {
        return signal;
    }

    public void setSignal(boolean signal) {
        this.signal = signal;
        setGates();
    }

    public void setBranchement(Gate g, Integer inputIndex) {
        this.connections.add(g);
        this.inputSignals.add(inputIndex);
    }

    private void setGates() {
        int i = 0;
        for (Gate g : connections) {
            if (g.getClass().getSuperclass() == Gate_2_input.class) {
                if (1 == inputSignals.get(i)) {
                    ((Gate_2_input) g).setInput1(this);
                } else {
                    ((Gate_2_input) g).setInput2(this);
                }
            } else {
                ((Not_gate) g).setInput(this);
            }
            i++;
        }
    }
}
