
// Write a Java program to print the prime factorization of a given integer without using arrays,
// collections, or external libraries.


import java.util.Scanner;

public class Q4 {

    // Print the prime factorization
    static void primeFactorization(int number) {
        if (number == 1) {
            System.out.println("Prime factorization: 1");
            return;
        }

        System.out.print("Prime factorization: ");
        boolean first = true;

        // Check possible factors starting from 2
        for (int factor = 2; factor <= number / factor; factor++) {
            int count = 0;

            // Divide repeatedly by the same factor
            while (number % factor == 0) {
                count++;
                number = number / factor;
            }

            if (count > 0) {
                if (!first) {
                    System.out.print(" x ");
                }

                System.out.print(factor + "^" + count);
                first = false;
            }
        }

        // Any remaining number greater than 1 is prime
        if (number > 1) {
            if (!first) {
                System.out.print(" x ");
            }

            System.out.print(number + "^1");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        int number = sc.nextInt();

        if (number < 1) {
            System.out.println("Number must be at least 1.");
        } else {
            primeFactorization(number);
        }

        sc.close();
    }
}
