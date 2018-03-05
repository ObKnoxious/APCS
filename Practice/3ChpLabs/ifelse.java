// Program by Knox Crichton to complete Lab 3
import java.util.*;
import java.lang.*;
import java.text.*;

public class ifelse{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Problem 1");
        System.out.println("Input a grade");
        double gr = scan.nextDouble();
        if(gr > 70){
            System.out.println("PASSING");
        } else {
            System.out.println("NOT PASSING");
        }
        System.out.println("\nProblem 2");
        System.out.println("Input a number");
        double n = scan.nextDouble();
        if(n <= 50){
            System.out.println("GO");
        } else {
            System.out.println("STOP");
        }
        System.out.println("\nProblem 3");
        System.out.println("Input an integer");
        int in = scan.nextInt();
        if(in % 2 == 0){
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
        System.out.println("\nProblem 4");
        System.out.println("Input an integer");
        int in1 = scan.nextInt();
        if(in1 % 5 == 0){
            System.out.println("MULTIPLE OF 5");
        } else {
            System.out.println("NOT A MULTIPLE OF 5");
        }
        System.out.println("\nProblem 5");
        System.out.println("Input an integer");
        int in2 = scan.nextInt();
        if(in2 < 10){
            System.out.println("ONE DIGIT");
        } else if(in2 >= 100){
            System.out.println("THREE DIGITS");
        } else {
            System.out.println("TWO DIGITS");
        }
        System.out.println("\nProblem 6");
        System.out.println("Enter a jersey number");
        int j = scan.nextInt();
        if (j == 12 || j == 71 || j == 80){
            System.out.println("That number is retired from the seattle Seahwaks!");
        }
        System.out.println("\nProblem 7");
        System.out.println("Enter a state postal code");
        String s = scan.next();
        System.out.println(s);
        if(s.equalsIgnoreCase("wa") || s.equalsIgnoreCase("or") || s.equalsIgnoreCase("id")) {
            System.out.println("That state is in the PNW");
        } else {
            System.out.println("You should move to the PNW, it's great here!");
        }
        System.out.println("\nProblem 8");
        System.out.println("What size drink did you get?");
        String si = scan.next();
        si = si.toLowerCase();
        int oz = 0;
        switch(si){
            case "small": oz = 8; break;
            case "tall": oz = 12; break;
            case "grande": oz = 16; break;
            case "venti": oz = 20; break;
            default: System.out.println("Error, not a valid size!"); break;
        }
        System.out.println("You paid too much for a bad " + oz + "oz drink.");
    }
}




