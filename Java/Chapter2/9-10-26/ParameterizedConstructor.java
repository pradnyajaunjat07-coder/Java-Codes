// A parameterized constructor is a constructor that takes parameters to intialize an object with specific 
// values. It allows you to create objects with diffrent intial values, providing flexibility in object
// creation. In this example, we will create a class named student with a parameterized constructor to 
// intialize the name & marks of a student. We will then create an object of the student class by passing
// values to the parameterized constructor & display the name & marks of the student using a method.

class Student {
    String name;
    int marks;

    // Parameterized constructor
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        // Creating an object by passing values to the parameterized constructor
        Student s1 = new Student("Pradnya Jaunjat", 100);
        s1.display();
    }
}
