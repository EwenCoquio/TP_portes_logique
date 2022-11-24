import java.lang.*;

public class Not_gate {
    //attributs
    private boolean input;
    private boolean output;

    Not_gate() {

    }

    public boolean isInput() {
        return input;
    }

    public boolean isOutput() {
        return output;
    }

    public void setInput(boolean input) {
        this.input = input;
    }

    public void activate() {
        this.output = !this.input;
    }

    public String toString() {
        return Boolean.toString(this.output);
    }
}
