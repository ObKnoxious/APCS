// Client file for part 2 set 1 chapter 4 by Knox Crichton
import java.util.*;
import java.text.*;
import java.lang.*;
public class clientTVSet{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter TV Brand");
        String brand = scan.next();
        System.out.println("Enter TV Price");
        double price = scan.nextDouble();
        TVSet tv = new TVSet(brand, price);
        System.out.println(tv.toString());
        System.out.println("Enter new Brand");
        String newB = scan.next();
        tv.setBrand(newB);
        System.out.println(tv.getBrand());
        System.out.println("Enter new Price");
        double newP = scan.nextDouble();
        tv.setPrice(newP);
        System.out.println(tv.getPrice());
        System.out.println("Enter TV Brand to compare");
        String cBrand = scan.next();
        System.out.println("Enter TV Price to compare");
        double cPrice = scan.nextDouble();
        TVSet ctv = new TVSet(cBrand, cPrice);
        if(tv.equals(ctv)){
            System.out.println("This is the same TV");
        } else {
            System.out.println("This is a different TV");
        }
    }
}


