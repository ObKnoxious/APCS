// Class file for part 1 set 1 of Java Chapter 4 By Knox Crichton
public class Team{
    // Instance varriable
    private String name;
    // Constructor
    public Team(String name){
        this.name = name;
    }
    // Setter
    public void setName(String name){
        this.name = name;
    }
    // Getter
    public String getName(){
        return name;
    }
    // toString
    public String toString(){
        return "The name of this team is: " + name;
    }
    public boolean equals(Team o){
        if(!(o instanceof Team)){
            return false;
        } else {
            Team oTeam = (Team) o;
            return (name.equals(o.getName()));
        }
    }
}
