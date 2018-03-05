// Client class for part 1 set 1 chapter 4 by Knox Crichton
import java.util.*;
import java.text.*;
import java.lang.*;
public class clientTeam{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a name for a new team");
        String name = scan.nextLine();
        Team test = new Team(name);
        System.out.println(test.toString());
        System.out.println("Enter a new name for the team");
        String newName = scan.nextLine();
        test.setName(newName);
        System.out.println(test.getName());
        System.out.println("Enter a team name to compare");
        String equalName = scan.nextLine();
        Team equalTeam = new Team(equalName);
        if(test.equals(equalTeam)){
            System.out.println("These team names are the same");
        } else {
            System.out.println("These team names are different");
        }
    }
}

