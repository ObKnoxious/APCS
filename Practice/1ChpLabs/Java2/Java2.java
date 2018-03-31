import java.util.*;
public class Java2{
    public static void main(String args[]){
        System.out.println(hLength());
        sLength();
        System.out.println(s5());
    }
    //Returns the  number of chars in hello world
    public static int hLength(){
        String hw = new String("Hello World");
        int hLength = hw.length();
        return hLength;
    }
    //Prints a string from input and its length
    public static void sLength(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a string");
        String str = new String(scan.nextLine());
        int sLength = str.length();
        System.out.println(str + " " + sLength);
    }
    //Prints the square root of 5
    public static double s5(){
        return Math.sqrt(5);
    }
}

