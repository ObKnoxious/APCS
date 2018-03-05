//Program by Knox Crichton to complete the Mortgage calculator lab
import java.util.*;
import java.text.*;
public class Mortgage{
    public static void main(String args[]){
        DecimalFormat df = new DecimalFormat("###,###,###.00");
        DecimalFormat df1 = new DecimalFormat("#.#");
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your interest rate? (Example, 0.05)");
        double rate = scan.nextDouble();
        rate = rate / 12;
        System.out.println("How many years is your mortgage set for?");
        double time = scan.nextDouble();
        System.out.println("How much money did you borrow?");
        double princ = scan.nextDouble();
        System.out.println("Your annual interest rate is " + df1.format(rate * 100) +"%");
        System.out.println("For a $" + princ + " mortgage.");
        double paynum = time * 12;
        double eq = princ*(rate*Math.pow(1+rate, paynum))/((Math.pow(1+rate, paynum)-1));
        System.out.println("Which you pay $" + df.format(eq) + " a month on.");
        System.out.println("Which will come to a grand total of $" + df.format(eq * paynum) + " after making " + df1.format(paynum) + " payments over " + df1.format(time) + " years.");
        double opay = (paynum * eq) / princ;
        System.out.println("That is " + df.format((eq*paynum)-princ) + " more than what the mortgage if for due to interest, resulting in a " + df.format(opay) + "% overpay.");
    }
}




