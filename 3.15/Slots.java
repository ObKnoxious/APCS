import java.util.Random;
import java.util.Scanner;
public class Slots{
    private static void printArray(int[] arr){
        for (int c=0;c<arr.length;c++){
            if(c>0){
                System.out.print(", ");
            }
            System.out.print(arr[c]);
        }
    }

    public static void main(String[] args){
        while(true){
            int[] machine = new int[3];
            Random gen = new Random();
            for(int c=0;c<=2;c++){
                 machine[c] = gen.nextInt(10);
            }
            int repeat;
            repeat = -3;
            for(int c=0;c<machine.length;c++){
                for(int d=0;d<machine.length;d++){
                    if (machine[c]==(machine[d]))
                        repeat= repeat+1;
                }
            }
            printArray(machine);
            System.out.println("\n You got " + repeat + " matching");
            String sent;
            Scanner scan = new Scanner (System.in);
            System.out.println("Hit Enter to continue or type QUIT to stop.");
            sent = scan.nextLine();
            String quit = "quit";
            if(quit.equalsIgnoreCase(sent)){
                break;
            }
        }
    }
}
