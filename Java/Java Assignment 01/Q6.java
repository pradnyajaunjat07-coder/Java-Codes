// Design a "Student" class to calculate and display a student's academic result for five subjects.

import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;
    private int mark1, mark2, mark3, mark4, mark5;

    // Parameterized constructor
    Student(String name, int rollNumber,
            int m1, int m2, int m3, int m4, int m5) {
        this.name = name;
        this.rollNumber = rollNumber;

        setMarks(m1, m2, m3, m4, m5);
    }

    // Validate and set marks
    void setMarks(int m1, int m2, int m3, int m4, int m5) {
        if (m1 < 0 || m1 > 100 ||
            m2 < 0 || m2 > 100 ||
            m3 < 0 || m3 > 100 ||
            m4 < 0 || m4 > 100 ||
            m5 < 0 || m5 > 100) {
            throw new IllegalArgumentException(
                "Every mark must be between 0 and 100."
            );
        }

        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
        mark4 = m4;
        mark5 = m5;
    }

    // Getter methods
    String getName() {
        return name;
    }

    int getRollNumber() {
        return rollNumber;
    }

    // Calculate total marks
    int calculateTotal() {
        return mark1 + mark2 + mark3 + mark4 + mark5;
    }

    // Calculate percentage
    double calculatePercentage() {
        return calculateTotal() / 5.0;
    }

    // A student passes only if every subject mark is at least 40
    String calculateResult() {
        if (mark1 >= 40 && mark2 >= 40 &&
            mark3 >= 40 && mark4 >= 40 && mark5 >= 40) {
            return "PASS";
        }

        return "FAIL";
    }

    // Display the complete result
    void displayResult() {
        System.out.println("Student Name: " + getName());
        System.out.println("Roll Number: " + getRollNumber());
        System.out.println("Total Marks: " + calculateTotal() + "/500");
        System.out.println("Percentage: " + calculatePercentage() + "%");
        System.out.println("Result: " + calculateResult());
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Roll Number: ");
            int roll = Integer.parseInt(sc.nextLine());

            System.out.println("Enter marks for five subjects:");
            int m1 = Integer.parseInt(sc.nextLine());
            int m2 = Integer.parseInt(sc.nextLine());
            int m3 = Integer.parseInt(sc.nextLine());
            int m4 = Integer.parseInt(sc.nextLine());
            int m5 = Integer.parseInt(sc.nextLine());

            if (roll <= 0 || name.trim().isEmpty()) {
                System.out.println("Invalid student details.");
            } else {
                Student student =
                    new Student(name, roll, m1, m2, m3, m4, m5);

                student.displayResult();
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid whole numbers.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
