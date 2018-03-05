//Program by Knox Crichton to complete the ATM lab
import java.util.*;
import java.text.*;
import java.lang.*;
public class ATM{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String uname = "login";
        int pin = 1337;
        boolean login = false;
        boolean pass = false;
        double bal = 0;
        DecimalFormat df = new DecimalFormat("$0.00");
        while(login == false){
            System.out.println("Login username: ");
            String uinput = scan.nextLine();
            if (uinput.equals(uname)){
                login = true;
            } else {
                System.out.println("Error: Incorrect Username");
            }
        }
        while(pass == false){
            System.out.println("PIN for " + uname);
            int pinput = scan.nextInt();
            if (pinput == pin){
                pass = true;
            } else {
                System.out.println("Error: Incorrect Password");
            }
        }
        System.out.println("Login complete");
        boolean active = true;
        while(active == true){
            System.out.println("What would you like to do?\n1:Check ballance\n2:Deposit Check(s)\n3:Withdraw Money\n4:Logout");
            int deci = scan.nextInt();
            switch(deci){
                case 1: System.out.println("Your balance is: " + df.format(bal)); break;
                case 2: System.out.println("Deposit Checks");
                        System.out.println("How many Checks would you like to deposit?");
                        int cnum = scan.nextInt();
                        double ctot = 0;
                        for(int i=0;i<cnum;i++){
                            //int ii = i + 1
                            System.out.println("How much money is Check " +(i+1)+ " for?");
                            double dam = scan.nextDouble();
                            ctot = ctot + dam;
                        }
                        bal = bal + ctot;
                        System.out.println("You deposited " + df.format(ctot) + " in checks.");
                        break;
                case 3: System.out.println("Withdraw Money");
                        System.out.println("How much money would you like to withdraw?");
                        double wd = scan.nextDouble();
                        if (wd > bal){
                            System.out.println("Cannot withdraw more than current balance");
                            break;
                        } else {
                            bal = bal - wd;
                            System.out.println("You withdrew " +  df.format(wd) + ". Your balance is now " + df.format(bal) + ".");
                        }
                        break;
                case 4: System.out.println("Logout Complete"); System.exit(0); break;
                default: System.out.println("Not a valid input"); break;
            }
                        
        }

    }
}



