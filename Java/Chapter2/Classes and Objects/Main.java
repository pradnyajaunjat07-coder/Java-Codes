// Class and Object , Why we need to add 2 classes in a sinple program, and the syntax.

// Student class
class Student {

    String name;
    int marks;

    // Method to display student details
    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
    }
}


// Main class
public class Main {

    public static void main(String[] args) {

        // Creating objects of Student class
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        // Giving values to s1
        s1.name = "Pradnya";
        s1.marks = 85;

        // Giving values to s2
        s2.name = "Sahil";
        s2.marks = 75;

        // Giving values to s3
        s3.name = "Simran";
        s3.marks = 90;

        // Display student details
        s1.display();
        s2.display();
        s3.display();
    }
}