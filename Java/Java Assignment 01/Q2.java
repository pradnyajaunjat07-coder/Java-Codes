
//Write a Java program to display all Armstrong numbers between two user-entered positive integers.

import java.util.Scanner;

public class Q2 {

    // Count the number of digits
    static int countDigits(int number) {
        int count = 0;

        do {
            count++;
            number = number / 10;
        } while (number > 0);

        return count;
    }

    // Calculate power using a loop
    static int power(int base, int exponent) {
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }

        return result;
    }

    // Check whether a number is an Armstrong number
    static boolean isArmstrong(int number) {
        int original = number;
        int digits = countDigits(number);
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum = sum + power(digit, digits);
            number = number / 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Start: ");
        int start = sc.nextInt();

        System.out.print("End: ");
        int end = sc.nextInt();

        if (start < 1 || end < 1 || start > end) {
            System.out.println("Invalid range.");
        } else {
            System.out.print("Armstrong numbers: ");

            for (int i = start; i <= end; i++) {
                if (isArmstrong(i)) {
                    System.out.print(i + " ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
