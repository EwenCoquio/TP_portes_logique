package wires;

import gates.*;

public class Test2 {
    public static Gate tesy() {
        Wire w1 = new Wire();
        Wire w2 = new Wire();
        Wire w3 = new Wire();
        Wire w4 = new Wire();
        Gate p1 = new And_gate(false, true);
        Gate p2 = new Not_gate();
        Gate p3 = new Or_gate();
        Gate p4 = new And_gate();
        Gate p5 = new Not_gate();
        p1.activate();
        w1.setSignal(p1.getOutput());
        w1.setBranchement(p2, 2);
        ((Not_gate) p2).setInput(w1);
        p2.activate();
        w1.setBranchement(p3, 2);
        w2.setBranchement(p3, 1);
        w2.setSignal(p2.getOutput());
        ((Gate_2_input) p3).setInput1(w1);
        ((Gate_2_input) p3).setInput2(w2);
        p3.activate();
        w1.setBranchement(p4, 1);
        w3.setBranchement(p4, 1);
        w3.setSignal(p3.getOutput());
        ((Gate_2_input) p4).setInput1(w1);
        ((Gate_2_input) p4).setInput2(w3);
        p4.activate();
        w4.setBranchement(p5, 1);
        w4.setSignal(p4.getOutput());
        ((Not_gate) p5).setInput(w4);
        p5.activate();
        return p5;
    }
}
