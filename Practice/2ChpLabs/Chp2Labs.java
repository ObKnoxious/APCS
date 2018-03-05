import java.util.*;
import java.text.*;
public class Chp2Labs {
    public static void main(String args[]){
        interest();
        shots();
        randAvg();
    }
    public static void interest(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input initial ammmount to invest: ");
        Double init = scan.nextDouble();
        System.out.println("Input the interest rate (i.e. 0.065");
        Double rate = scan.nextDouble();
        Double fv1 = Math.pow(1+rate, 5);
        Double fv2 = Math.pow(1+rate, 10);
        Double fv3 = Math.pow(1+rate, 20);
        Double fvf1 = init * fv1;
        Double fvf2 = init * fv2;
        Double fvf3 = init * fv3;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("The investment will be worth $" + df.format(fvf1) + " after 5 years, $" + df.format(fvf2) + " after 10 years, and $" + df.format(fvf3) + " after 20 years.");
    }
    public static void shots(){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many shots were made?");
        Double made = scan.nextDouble();
        System.out.println("How many shots were taken?");
        Double taken = scan.nextDouble();
        Double acc = made / taken;
        DecimalFormat df = new DecimalFormat("0.##");
        System.out.println("Percent of shots hit was " +  df.format(acc*100) + "%");
    }
    public static void randAvg(){
        // fReExxXXXInturnutsPLSxDDDDDHA
        //dOwnLOOAD Wobwox four fwee haha
        //please
        //Ur mom is a string class.
        //jk she ok
        //
        //Written by Shawn Norman in AP EURO
        double total = 0;
        for(double i=0;i<=4;i++){
            double app = (double) Math.floor(Math.random() * 51);
            total += app;
        }
        System.out.println("The average of 5 random numbers is " + total / 5);
    }
}

        
