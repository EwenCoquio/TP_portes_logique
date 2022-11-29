package wires;

import gates.*;

public class Test {
    public static Gate test(){
        Wire w1 = new Wire();
        Wire w2 = new Wire();
        Wire w3 = new Wire();
        Gate p1 = new And_gate(true, true);
        p1.activate();
        Gate p2 = new Or_gate(false, false);
        p2.activate();
        w1.setSignal(p1.getOutput());
        w2.setSignal(p2.getOutput());
        Gate p3 = new Or_gate(w1.getSignal(), w2.getSignal());
        p3.activate();
        w3.setSignal(p3.getOutput());
        Gate p4 = new Not_gate(w3.getSignal());
        p4.activate();
        return p4;
    }
}
