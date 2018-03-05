// Class for part 3 of set 1, by Knox Crichton
import java.lang.*;
public class Grade{
    // Instance varriables
    private char grade;
    private String name;
    // Constructor
    public Grade(char grade, String name){
        this.grade = grade;
        this.name = name;
    }
    // Setters n Getters
    public char getGrade(){return grade;}
    public String getName(){return name;}
    public void setGrade(char grade){this.grade = grade;}
    public void setName(String name){this.name = name;}
    // To string & equals
    public String toString(){
        return "" + grade + " Is the current grade in " + name;
    }
    public boolean equals(Grade o){
        if(!(o instanceof Grade)){
            return false;
        } else {
            Grade oGrade = (Grade) o;
            if(name.equalsIgnoreCase(o.getName()) && Character.toLowerCase(grade) == Character.toLowerCase(o.getGrade())){
                return true;
            } else {
                return false;
            }
        }
    }
}

        

