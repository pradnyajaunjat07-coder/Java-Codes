
// Write a Java program to find the second-largest distinct digit in a positive integer without using
// arrays, sorting, or built-in maximum functions.

import java.util.Scanner;

public class Q1 {

    // Find the second-largest distinct digit
    static int secondLargestDigit(int number) {
        int largest = -1;
        int secondLargest = -1;

        while (number > 0) {
            int digit = number % 10; // Get last digit

            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit < largest && digit > secondLargest) {
                // Ignore repeated occurrences of the largest digit
                secondLargest = digit;
            }

            number = number / 10; // Remove last digit
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int result = secondLargestDigit(number);

            if (result == -1) {
                System.out.println(
                    "Fewer than two distinct digits exist."
                );
            } else {
                System.out.println(
                    "Second-largest distinct digit: " + result
                );
            }
        }

        sc.close();
    }
}
