
// Write a Java program to determine whether a given positive integer is a Strong Number.

import java.util.Scanner;

public class Q3 {

    // Calculate the factorial of a digit
    static int factorial(int digit) {
        int fact = 1;

        for (int i = 1; i <= digit; i++) {
            fact = fact * i;
        }

        return fact;
    }

    // Check whether the number is a Strong Number
    static boolean isStrong(int number) {
        int original = number;
        int sum = 0;

        do {
            int digit = number % 10;
            sum = sum + factorial(digit);
            number = number / 10;
        } while (number > 0);

        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else if (isStrong(number)) {
            System.out.println(number + " is a Strong Number.");
        } else {
            System.out.println(number + " is not a Strong Number.");
        }

        sc.close();
    }
}
