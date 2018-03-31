import java.util.*;
public class Java1{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first password");
        String pass1 = scan.nextLine();
        System.out.println("Enter second password");
        String pass2 = scan.nextLine();
        int p1Length = pass1.length();
        int p2Length = pass2.length();
        if (p1Length < p2Length){
            System.out.println(p1Length);
        } else {
            System.out.println(p2Length);
        }

    }
}


