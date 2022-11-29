package gates;

import wires.Wire;

public  class And_gate extends Gate_2_input{

    public And_gate() {
    }
    @Override
    public void activate(){
        this.output.setSignal(this.input1.getSignal() && this.input2.getSignal());

    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "sortie : " + this.output;
    }

}
