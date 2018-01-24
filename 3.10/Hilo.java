import java.util.Scanner;
import java.util.Random;
public class Hilo{
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        Random gen = new Random();
        int pick;
        pick = gen.nextInt(100)+1;
        int user;
        user = 999;
        while (user != pick){
            System.out.println("Guess a number between 1 and 100, guess 0 to quit.");
            user = scan.nextInt();
            if (user == 0)
                break;
            else if (user > pick)
                System.out.println("Too high!");
            else if (user < pick)
                System.out.println("Too low!");
            else if (user == pick)
                System.out.println("Correct!");
            else 
                System.out.println("Not a valid input.");
        }
    }
}

