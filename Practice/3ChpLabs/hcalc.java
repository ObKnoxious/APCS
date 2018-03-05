// hcalc by Knox Crichton 
// Makes a human calculator as described in lab 2
import java.util.*;
import java.lang.*;
import java.text.*;
public class hcalc{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the first integer to use:");
        int i1 = scan.nextInt();
        System.out.println("Input the opperator (Addition, Subtraction, Multiplication, Division, Exponentiation):");
        char o = scan.next().charAt(0);
        System.out.println("Input the second integer to use:");
        int i2 = scan.nextInt();
        if(i1 < 0 || i1 >=10 || i2 < 0 || i2 >= 10){
            System.out.println("That's not a vaild integer for this calculator!"); System.exit(0);
        }
        ArrayList<String> obj = new ArrayList<String>();
        obj.add(0, "Zero");obj.add(1, "One");obj.add(2, "Two");obj.add(3, "Three");obj.add(4, "Four");obj.add(5, "Five");obj.add(6, "Six");obj.add(7, "Seven");obj.add(8, "Eight");obj.add(9, "Nine");
        double res = -1;
        switch(o){
            case '+': res = i1 + i2;
                      System.out.println(obj.get(i1) + " plus " + obj.get(i2) + " equals " +  res);
                      break;
            case '-': res = i1 - i2;
                      System.out.println(obj.get(i1) + " minus " + obj.get(i2) + " equals " +  res);
                      break;
            case '*': res = i1 * i2;
                      System.out.println(obj.get(i1) + " times " + obj.get(i2) + " equals " + res);
                      break;
            case '/': res = i1 / i2;
                      System.out.println(obj.get(i1) + " divided by " + obj.get(i2) + " equals " + res);
                      break;
            case '^': res = Math.pow(i1, i2);
                      System.out.println(obj.get(i1) + " to the power of " + obj.get(i2) + " equals " + res);
                      break;
            default: System.out.println("That's not a valid opperator!");
                     break;
        }
    }
}
