class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

public class ch8_ps8Q1 {
    public static void main(String[] args) {
        Employee harry = new Employee();

        harry.setName("Harry");
        harry.salary = 23000;
        System.out.println(harry.getName());
        System.out.println(harry.getSalary());

    }
}