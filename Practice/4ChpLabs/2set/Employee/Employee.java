//Code for completion of Chapter 4 lab set 2 part 1 by Knox Crichton 
public class Employee{
    private String name;
    private int id;
    private String department;
    private String position;

    public Employee(String name, int id, String department, String position){
        this.name = name;
        this.id = id;
        this.department = department;
        this.position = position;
    }
    public String getName(){return name;}
    public int getID(){return id;}
    public String getDepartment(){return department;}
    public String getPosition(){return position;}

    public void setName(String value){name = value;}
    public void setID(int value){id = value;}
    public void setDepartment(String value){department = value;}
    public void setPosition(String value){position = value;}
}
