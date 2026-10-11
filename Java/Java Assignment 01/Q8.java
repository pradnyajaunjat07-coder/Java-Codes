// Create an "Employee" class to calculate an employee's annual salary and performance bonus.

import java.util.Scanner;

class Employee {
    private String name;
    private int employeeId;
    private double monthlySalary;
    private int rating;

    // Parameterized constructor
    Employee(String name, int employeeId,
             double monthlySalary, int rating) {
        if (name.trim().isEmpty() || employeeId <= 0 ||
            !Double.isFinite(monthlySalary) || monthlySalary < 0 ||
            rating < 1 || rating > 5) {
            throw new IllegalArgumentException(
                "Invalid employee details, salary, or rating."
            );
        }

        this.name = name;
        this.employeeId = employeeId;
        this.monthlySalary = monthlySalary;
        this.rating = rating;
    }

    // Calculate annual salary
    double calculateAnnualSalary() {
        return monthlySalary * 12;
    }

    // Return bonus percentage based on rating
    int getBonusPercentage() {
        switch (rating) {
            case 5:
                return 20;
            case 4:
                return 15;
            case 3:
                return 10;
            case 2:
                return 5;
            default:
                return 0;
        }
    }

    // Calculate annual bonus
    double calculateBonus() {
        return calculateAnnualSalary()
               * getBonusPercentage() / 100.0;
    }

    // Display salary details
    void displayDetails() {
        double annualSalary = calculateAnnualSalary();
        double bonus = calculateBonus();

        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Monthly Salary: " + monthlySalary);
        System.out.println("Annual Salary: " + annualSalary);
        System.out.println("Annual Bonus: " + bonus);
        System.out.println(
            "Total Annual Compensation: " + (annualSalary + bonus)
        );
    }
}

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Employee ID: ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print("Monthly Salary: ");
            double salary = Double.parseDouble(sc.nextLine());

            System.out.print("Performance Rating: ");
            int rating = Integer.parseInt(sc.nextLine());

            Employee employee = new Employee(name, id, salary, rating);
            employee.displayDetails();

        } catch (NumberFormatException e) {
            System.out.println("Please enter valid numeric values.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
