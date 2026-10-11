//Parameter and Arguements in java Example.

class CalculateMarks {

    // Function with parameters
    int add(int m1, int m2, int m3) {
        return m1 + m2 + m3;
    }

    // Function to calculate percentage
    double percentage(int total) {
        return total / 3.0;
    }

    // Function to display result
    void display(int total, double per) {
        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + per + "%");
    }
}


public class Main2 {

    public static void main(String[] args) {

        // Creating object
        CalculateMarks c = new CalculateMarks();

        // Arguments are passed here
        int total = c.add(80, 75, 90);

        // Passing total as argument
        double per = c.percentage(total);

        // Display result
        c.display(total, per);
    }
}