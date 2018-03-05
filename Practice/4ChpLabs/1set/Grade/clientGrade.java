// Client file for grade of set 1 by Knox Crichton
import java.util.*;
import java.lang.*;
import java.text.*;
public class clientGrade{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the name of this class");
        String name = scan.next();
        System.out.println("What is the letter grade in this class");
        char igrade = scan.next(".").charAt(0);
        Grade grade = new Grade(igrade, name);
        System.out.println(grade.toString());
        System.out.println("Enter a new name for the class");
        String newName = scan.next();
        grade.setName(newName);
        System.out.println(grade.getName());
        System.out.println("Enter a new letter grade for the class");
        char newGrade = scan.next(".").charAt(0);
        grade.setGrade(newGrade);
        System.out.println(grade.getGrade());
        System.out.println("Enter a name to compare");
        String cName = scan.next();
        System.out.println("Enter a letter grade to compare");
        char icGrade = scan.next(".").charAt(0);
        Grade cGrade = new Grade(icGrade, name);
        if(grade.equals(cGrade)){
            System.out.println("This is the same grade in the same class");
        } else {
            System.out.println("This is not the same grade in the same class");
        }
    }
}


