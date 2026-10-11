// Program to demonstrate Setters and Getters

class Student {

    // Private variables
    private String name;
    private int marks;

    // Setter for name
    void setName(String name) {
        this.name = name;
    }

    // Setter for marks
    void setMarks(int marks) {
        this.marks = marks;
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


public class SetterGetterEx1 {

    public static void main(String[] args) {

        // Creating Student object
        Student s1 = new Student();

        // Setting values using setters
        s1.setName("Pradnya");
        s1.setMarks(90);

        // Getting values using getters
        System.out.println("Name = " + s1.getName());
        System.out.println("Marks = " + s1.getMarks());
    }
}