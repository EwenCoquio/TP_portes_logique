package gates;

import java.util.Scanner;

public class Application_not {
    public static Not_gate Test_gate(){
        Not_gate p = new Not_gate();
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez choisir l'entree : true ou false");
        boolean in = sc.nextBoolean();
        //p.setInput(in);
        p.activate();
        return p;
    }
}
