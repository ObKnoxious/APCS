import java.util.Scanner;
public class Miles2KM{
    public static void main (String[] args){
        double miles;
        double km;
        Scanner scan =  new Scanner (System.in);
        
        System.out.println ("Enter miles to be converted:");

        miles = scan.nextDouble();
        km = miles *  1.60935;

        System.out.println (miles + " miles is equal to  " + km +  " kilometers.");
    }
}


