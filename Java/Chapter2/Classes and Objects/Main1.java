//Parameter & Arguements in Java.

class Calculate {

    void calculator(int a, int b) {
        int result = a + b;

        System.out.println("The sum of two numbers is: " + result);
    }
}

public class Main1 {

    public static void main(String[] args) {

        Calculate c = new Calculate();

        c.calculator(10, 20);
    }
}