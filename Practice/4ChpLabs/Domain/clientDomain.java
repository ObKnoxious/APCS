import java.util.*;
import java.lang.*;
import java.text.*;

public class clientDomain{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a Domain Name \n The Domain name must be formatted as prefix.domain.suffix!");
        String i = scan.nextLine();
        Domain myDomain = new Domain(i);
        System.out.println(myDomain.toString());
        if(myDomain.isWWW() == true){
            System.out.println("This domain begins with www and is on the worldwide web");
        } else {
            System.out.println("This domain does not begin with www and may or may not be on the worldwide web");
        }
        System.out.println("The top level domain of this is ." + myDomain.getTLD());
        System.out.println("The main name of this domain is " + myDomain.getName());
        System.out.println("Enter a Domain to comapre");
        String i1 = scan.nextLine();
        Domain compare = new Domain(i1);
        if(myDomain.equals(compare)){
            System.out.println("This Domain is the same as the first one");
        } else {
            System.out.println("This Domain is different than the first one");
        }

        //System.out.println(myDomain.isWWW());
        //System.out.println(myDomain.getURL());
    }
}

