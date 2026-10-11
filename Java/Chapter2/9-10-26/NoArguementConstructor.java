// No-arguement Constructor Example in java.

public class NoArguementConstructor {
    // Instance variables
    String name;
    int marks;

    // No-argument constructor
    NoArguementConstructor() {
        name = "Pradnya Jaunjat";
        marks = 100;
    }

    // Method to display values
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public static void main(String args[]) {
        // Creating the object using the corrected class name spelling
        NoArguementConstructor obj = new NoArguementConstructor();
        obj.display();
    }
}
