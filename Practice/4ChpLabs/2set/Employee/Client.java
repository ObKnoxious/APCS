public class Client{
    public static void main(String args[]){
        Employee s = new Employee("Susan Meyers", 47899, "Accounting", "VP");
        Employee m = new Employee("Mark Jones", 39229, "IT", "Engineer");
        Employee j = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
        System.out.println("Name\t ID Number\t Department\t Position\t");
        System.out.println(s.getName() + "\t" + s.getID() + "\t" + s.getDepartment() + "\t" + s.getPosition());
        System.out.println(m.getName() + "\t" + m.getID() + "\t" + m.getDepartment() + "\t" + m.getPosition());
        System.out.println(j.getName() + "\t" + j.getID() + "\t" + j.getDepartment() + "\t" + j.getPosition());
    }
}
