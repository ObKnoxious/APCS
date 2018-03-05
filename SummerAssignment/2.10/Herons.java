import java.util.Scanner;
import java.text.DecimalFormat;
public class Herons {
    public static void main (String[] args){
        double a;
        double b;
        double c;
        Scanner scan =  new Scanner (System.in);

        System.out.println("Enter length of side A");
        a = scan.nextDouble();

        System.out.println("Enter length of side B");
        b = scan.nextDouble();

        System.out.println("Enter length of side C");
        c = scan.nextDouble();
        
        double s;
        s = a + b + c;
        s = s / 2;

        double area;
        area = s *  (s - a) * (s - b) *  (s - c);
        area = Math.sqrt(area);
        
        DecimalFormat three = new DecimalFormat("#.000");

        System.out.println("The area of the triangle is " + three.format(area));
    }
}

