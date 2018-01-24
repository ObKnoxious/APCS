import java.util.Scanner;
public class Sum{
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        int input;
        System.out.println("Enter a number to find the sum of all even integers between 2 and it.");
        input = scan.nextInt();
        if (input % 2 != 0)
            input = input - 1;
        int n;
        n = (2+input)/2 - 1;
        int output;
        output = n*(n+1);
        if (input < 2)
            System.out.println("That number is to small.");
        else {
            System.out.println(output);
        }
    }
}

