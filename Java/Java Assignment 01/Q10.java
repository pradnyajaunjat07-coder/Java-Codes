// Create an "Employee" class and compare two employee objects based on their annual salary.

import java.util.Scanner;

class Employee {
    private String name;
    private int employeeId;
    private double monthlySalary;

    // Parameterized constructor
    Employee(String name, int employeeId, double monthlySalary) {
        if (name.trim().isEmpty() || employeeId <= 0 ||
            !Double.isFinite(monthlySalary) || monthlySalary < 0) {
            throw new IllegalArgumentException(
                "Invalid employee details or salary."
            );
        }

        this.name = name;
        this.employeeId = employeeId;
        this.monthlySalary = monthlySalary;
    }

    // Calculate annual salary
    double calculateAnnualSalary() {
        return monthlySalary * 12;
    }

    // Compare this employee with another employee object
    void compareSalary(Employee other, int firstNumber,
                       int secondNumber) {
        double salary1 = calculateAnnualSalary();
        double salary2 = other.calculateAnnualSalary();

        if (salary1 > salary2) {
            System.out.println("Employee " + firstNumber
                + " earns more than Employee " + secondNumber + ".");
        } else if (salary2 > salary1) {
            System.out.println("Employee " + secondNumber
                + " earns more than Employee " + firstNumber + ".");
        } else {
            System.out.println("Employee " + firstNumber
                + " and Employee " + secondNumber
                + " have equal annual salaries.");
        }
    }

    // Return the employee object with the higher annual salary
    Employee getHigherPaidEmployee(Employee other) {
        if (this.calculateAnnualSalary()
                >= other.calculateAnnualSalary()) {
            return this;
        } else {
            return other;
        }
    }

    // Display the highest-paid employee
    void displayDetails() {
        System.out.println("Highest-paid employee: " + name);
        System.out.println(
            "Annual Salary: " + calculateAnnualSalary()
        );
    }
}

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Create three employee objects
            System.out.println("Enter Employee 1 details:");
            System.out.print("Name: ");
            String name1 = sc.nextLine();
            System.out.print("Employee ID: ");
            int id1 = Integer.parseInt(sc.nextLine());
            System.out.print("Monthly Salary: ");
            double salary1 = Double.parseDouble(sc.nextLine());

            Employee employee1 = new Employee(name1, id1, salary1);

            System.out.println("Enter Employee 2 details:");
            System.out.print("Name: ");
            String name2 = sc.nextLine();
            System.out.print("Employee ID: ");
            int id2 = Integer.parseInt(sc.nextLine());
            System.out.print("Monthly Salary: ");
            double salary2 = Double.parseDouble(sc.nextLine());

            Employee employee2 = new Employee(name2, id2, salary2);

            System.out.println("Enter Employee 3 details:");
            System.out.print("Name: ");
            String name3 = sc.nextLine();
            System.out.print("Employee ID: ");
            int id3 = Integer.parseInt(sc.nextLine());
            System.out.print("Monthly Salary: ");
            double salary3 = Double.parseDouble(sc.nextLine());

            Employee employee3 = new Employee(name3, id3, salary3);

            // Compare the first two employees
            employee1.compareSalary(employee2, 1, 2);

            // Compare the second and third employees
            employee2.compareSalary(employee3, 2, 3);

            // Find the highest-paid employee
            Employee highest = employee1.getHigherPaidEmployee(employee2);
            highest = highest.getHigherPaidEmployee(employee3);

            // Display the result
            highest.displayDetails();

        } catch (NumberFormatException e) {
            System.out.println("Please enter valid numeric values.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
