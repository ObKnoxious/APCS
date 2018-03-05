import java.util.Scanner;
public class Leap{
    public static void main (String[] args){
        int inputYear;
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter a year to check if leap year:");
        inputYear = scan.nextInt();
        boolean result;
        result = isLeap(inputYear);
        if (result == true && inputYear >= 1582)
            System.out.println(inputYear + " is a leap year.");
        else if (result == false && inputYear >= 1582)
            System.out.println(inputYear + " is not a leap year.");
        else 
            System.out.println(inputYear + " is before leap years started.");
    }
    public static boolean isLeap (int year){
        boolean leap;
        if (year % 400 == 0){
            leap = true;
            return leap;
        }
        else if (year % 100 != 0 && year % 4 == 0){
            leap = true;
            return leap;
        }
        else {
            leap = false;
            return leap;
        }
    }
}

