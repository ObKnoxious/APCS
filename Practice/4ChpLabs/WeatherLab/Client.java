//Client test file for weather lab by Knox Crichton
import java.util.*;
import java.lang.*;
public class Client{
    public static void main(String args[]){
        System.out.println("Program to test all methods of weather class");
        System.out.println("Testing defult weather");
        Weather defult = new Weather();
        System.out.println(defult.toString());
        Scanner scan = new Scanner(System.in);
        System.out.println("Temp for testing");
        int iTemp = scan.nextInt();
        System.out.println("Conditions for testing");
        String iCond = scan.next();
        System.out.println("Testing custom weather");
        Weather custom = new Weather(iCond, iTemp);
        System.out.println(custom.toString());
        System.out.println("Change temp for testing");
        iTemp = scan.nextInt();
        custom.setTemp(iTemp);custom.setConditions(iCond);
        System.out.println("Change Conditions for testing");
        iCond = scan.next();
        System.out.println("" + custom.getTemp() + " " + custom.getConditions());
        System.out.println("Checking Consistency");
        //
        System.out.println("Checking if custom is equal to defult");
        if(custom.equals(defult)){
            System.out.println("Objects are equal");
        } else {
            System.out.println("Objects are not equal");
        }
        System.out.println("The custom temp in celsisus is " + custom.fToC());

    }
}

