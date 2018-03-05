public class Employee{
    String name;
    int id;
    String department;
    String position;
    public String getName(){return name;}
    public int getID(){return id;}
    public String getDepartment(){return department;}
    public String getPosition(){return position;}

    public void setName(String value){name = value;}
    public void setID(int value){id = value;}
    public void setDepartment(String value){department = value;}
    public void setPosition(String value){position = value;}
}
public class employeeProgram{
    public static void main(String args[]){
        Employee Ben = new Employee("Ben", 2, "working", "employeed");
        System.out.println(Ben);
    }
}
