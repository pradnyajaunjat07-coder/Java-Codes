// Constructor Overloading in Java.

class Student {
    String name;
    int marks;
    
    // 1. No-argument constructor
    Student() {
        name = "Pradnya Jaunjat";
        marks = 100;
    }

    // 2. Parameterized constructor with 1 argument (Note: 'String' must be capitalized)
    Student(String name) {
        this.name = name;
        marks = 0;
    }

    // 3. Parameterized constructor with 2 arguments
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Added the missing display method
    void display() {
        System.out.println("Name: " + name + ", Marks: " + marks);
    }
}

public class ConstructorOverload {
    public static void main(String[] args) {
        // Calling Constructor 1 (No-argument)
        Student s1 = new Student();
        
        // Calling Constructor 2 (1 argument)
        Student s2 = new Student("Simran Gholap");
        
        // Calling Constructor 3 (2 arguments)
        Student s3 = new Student("Aditi Ghode", 95);

        // Printing details
        s1.display();
        s2.display();
        s3.display();
    }
}
