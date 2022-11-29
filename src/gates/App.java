package gates;

import java.util.Scanner;

public class App {
    public static Gate_2_input test() {
        Gate_2_input p = null;
        boolean in1;
        boolean in2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Combien de portes souhaitez vous creer ?");
        int nb = sc.nextInt();
        for (int i = 0; i < nb; i++) {
            System.out.println("Quelle porte souhaitez vous creer ? (1 -> AND, 2 -> OR, 3 -> NAND, 4 -> NOR)");
            int type = sc.nextInt();
            switch (type) {
                case 1:
                    p = new And_gate();
                    System.out.println("Veuillez choisir les entrees : true ou false");
                    in1 = sc.nextBoolean();
                    in2 = sc.nextBoolean();
                   // p.setInput1(in1);
                    //p.setInput2(in2);
                    p.activate();
                    System.out.println(p);
                    break;
                case 2:
                    p = new Or_gate();
                    System.out.println("Veuillez choisir les entrees : true ou false");
                    in1 = sc.nextBoolean();
                    in2 = sc.nextBoolean();
                    //p.setInput1(in1);
                  //  p.setInput2(in2);
                    p.activate();
                    System.out.println(p);
                    break;
                case 3:
                    p = new Nand_gate();
                    System.out.println("Veuillez choisir les entrees : true ou false");
                    in1 = sc.nextBoolean();
                    in2 = sc.nextBoolean();
                    //p.setInput1(in1);
                    //p.setInput2(in2);
                    p.activate();
                    System.out.println(p);
                    break;
                case 4:
                    p = new Nor_gate();
                    System.out.println("Veuillez choisir les entrees : true ou false");
                    in1 = sc.nextBoolean();
                    in2 = sc.nextBoolean();
                   // p.setInput1(in1);
                   // p.setInput2(in2);
                    p.activate();
                    System.out.println(p);
                    break;
            }
        }
        return p;
    }
    private static void ask(){
        //todo
    }
}
