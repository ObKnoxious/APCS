import java.util.Random;
import java.text.DecimalFormat;

public class PhoneNumber {
    public static void main (String[] args){

        DecimalFormat three = new DecimalFormat ("000");
        DecimalFormat four = new DecimalFormat ("0000");
        Random generator = new Random();
        int num1;
        num1 = generator.nextInt(8);
        int num2;
        num2 = generator.nextInt(8);
        int num3;
        num3 = generator.nextInt(8);

        int set2;
        set2 = generator.nextInt(742);

        int set3;
        set3 = generator.nextInt(9999);

        System.out.println("Random phone number: \n" + num1+num2+num3 +"-"+ three.format(set2) +"-"+ four.format(set3));
    }
}

