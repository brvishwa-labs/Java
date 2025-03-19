package programs;

import java.util.Scanner;

public class NestedSwitchDay6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String dept=sc.next();
        String mentor=sc.next();
        switch(dept){
            case "cse":
                switch (mentor){
                    case "lavanya":
                        System.out.println("tharkuri");
                        break;
                    case "sivasankari":
                        System.out.println("arivalii");
                        break;
                    default:
                        System.out.println("arivalli");
                }
            break;
            case "mech":
                switch (mentor){
                    case "natraj":
                        System.out.println("lusu bunda");
                        break;
                    case "kamalnadhan":
                        System.out.println("very lusu bunda");
                        break;
                    default:
                        System.out.println("muttall");
                        break;

                }
            break;
        }


//        enhanced
//        switch (dept) {
//            case "cse" -> {
//                switch (mentor) {
//                    case "lavanya" -> System.out.println("tharkuri");
//                    case "sivasankari" -> System.out.println("arivalii");
//                    default -> System.out.println("arivalli");
//                }
//            }
//            case "mech" -> {
//                switch (mentor) {
//                    case "natraj" -> System.out.println("lusu bunda");
//                    case "kamalnadhan" -> System.out.println("very lusu bunda");
//                    default -> System.out.println("muttall");
//                }
//            }
//        }

    }
}
