// create a class named employee with private fields for name, emp_id, & salary.
// Implement a no-arguement constructor to intialize the employee with default values for name, emp_id, & salary.
// Implemant a parameterized constructor to intialize the employee with specific values for name,emp_id, & salary.
// Provide public getter methods to access the private fields. In the main method, create
// two instances of the employee class, one using the no-agruement constuctor & the other using the
// parameterized constructor. Display the name & salary of both employees using the getter methods.

class Employee {
    // Private fields
    private String name;
    private int emp_id;
    private double salary;

    // Constructor 1: Default / No-argument constructor
    public Employee() {
        this.name = "Pradnya Jaunjat";
        this.emp_id = 101;
        this.salary = 75000.0;
    }

    // Constructor 2: Parameterized constructor (overloaded)
    public Employee(String name, int emp_id, double salary) {
        this.name = name;
        this.emp_id = emp_id;
        this.salary = salary;
    }

    // Public getters to access private fields
    public String getName() { return name; }
    public int getEmpId() { return emp_id; }
    public double getSalary() { return salary; }
}

public class HRsystem {
    public static void main(String[] args) {
        // 1. Using the no-argument constructor
        Employee emp1 = new Employee();
        System.out.println("Emp 1 Name: " + emp1.getName());
        System.out.println("Emp 1 Salary: ₹" + emp1.getSalary());

        System.out.println(); // Blank line for separation

        // 2. Using the parameterized constructor
        Employee emp2 = new Employee("simran Gholap", 102, 90000.0);
        System.out.println("Emp 2 Name: " + emp2.getName());
        System.out.println("Emp 2 Salary: ₹" + emp2.getSalary());
    }
}
