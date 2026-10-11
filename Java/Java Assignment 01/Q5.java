// Write a Java program to calculate the Greatest Common Divisor (GCD) and Least Common Multiple (LCM)
// of two positive integers.

import java.util.Scanner;

public class Q5 {

    // Find GCD using the Euclidean algorithm
    static int findGCD(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }

    // Find LCM by reusing the GCD method
    static long findLCM(int a, int b) {
        int gcd = findGCD(a, b);

        // Divide before multiplying to reduce overflow risk
        return ((long) a / gcd) * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("First number: ");
        int first = sc.nextInt();

        System.out.print("Second number: ");
        int second = sc.nextInt();

        if (first <= 0 || second <= 0) {
            System.out.println("Both numbers must be positive.");
        } else {
            System.out.println("GCD: " + findGCD(first, second));
            System.out.println("LCM: " + findLCM(first, second));
        }

        sc.close();
    }
}
