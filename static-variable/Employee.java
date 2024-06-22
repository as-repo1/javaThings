class Employee {
    int empid;
    String name;
    static String companyName;
    
    Employee(int empid, String name) {
        this.empid = empid;
        this.name = name;
    }

    Employee(int empid, String name, String company) {
        this.empid = empid;
        this.name = name;
        Employee.companyName = company;
    }

    void display() {
        System.out.println("EmpID: " + empid + ", Name: " + name + ", Company Name: " + companyName);
    }

    public static void main(String[] args) {
        Employee.companyName = "Chaos"; // Set the static variable once

        Employee e1 = new Employee(101, "Abhinaba");
        e1.display();
        Employee e2 = new Employee(102, "Abhi");
        e2.display();
    }
}
