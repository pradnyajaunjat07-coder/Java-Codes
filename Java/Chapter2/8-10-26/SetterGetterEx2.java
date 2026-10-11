// Setters and Getters with Validation

class Student {

    // Private variables
    private String name;
    private int marks;

    // Setter for name
    void setName(String name) {
        this.name = name;
    }

    // Setter for marks with validation
    void setMarks(int marks) {

        // Marks must be between 0 and 100
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        }
        else {
            System.out.println("Invalid marks");
        }
    }

    // Getter for name
    String getName() {
        return name;
    }

    // Getter for marks
    int getMarks() {
        return marks;
    }
}


public class SetterGetterEx2 {

    public static void main(String[] args) {

        // Create Student object
        Student s1 = new Student();

        // Set student details
        s1.setName("Pradnya");
        s1.setMarks(90);

        // Display student details
        System.out.println("Name = " + s1.getName());
        System.out.println("Marks = " + s1.getMarks());
    }
}