import java.util.Scanner;
public class Distance{
    public static void main (String[] args){
        double x1;
        double x2;
        double y1;
        double y2;
        Scanner scan =  new Scanner (System.in);
        
        System.out.println ("Enter first x-coordinate:");
        x1 = scan.nextDouble();
        
        System.out.println ("Enter first y-coordinate:");
        y1 = scan.nextDouble();

        System.out.println ("Enter second x-coordinate:");
        x2 = scan.nextDouble();

        System.out.println ("Enter second y-coordinate:");
        y2 = scan.nextDouble();

        double x2x1;
        x2x1 = x2  - x1;
        x2x1 = Math.pow(x2x1, 2);
        System.out.println ("x2x1^2 " + x2x1);
        double y2y1;
        y2y1 = y2 + y1;
        y2y1 = Math.pow(y2y1, 2);
        System.out.println ("y2y1^2 " + y2y1);
        double last;
        last = x2x1 - y2y1;
        System.out.println("last " + last);
        last =  Math.sqrt(last);

        System.out.println ("The distance between the two points is " + last);
        
    }
}


