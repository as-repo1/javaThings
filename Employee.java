public class Employee {
    String name;
    int emp_id;
    Employee(String name, int emp_id){
        this.name = name;
        this.emp_id = emp_id;
    }
    void display(){
        System.out.println("name: "+ name + " & ID: "+ emp_id);
    }
    public static void main(String[] args){
        Employee e1 = new Employee("abc", 101);
        Employee e2 = new Employee("xyz", 102);
        e1.display();
        e2.display();
    }
}
