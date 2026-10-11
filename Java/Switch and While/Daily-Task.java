# A code that perform the ATM operations using switch case in do while.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 5000;
        int choice;
        int amount;

        do {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdrawal");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Current Balance = " + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    amount = sc.nextInt();

                    balance = balance + amount;

                    System.out.println("Amount Deposited = " + amount);
                    System.out.println("Current Balance = " + balance);
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    amount = sc.nextInt();

                    balance = balance - amount;

                    System.out.println("Amount Withdrawn = " + amount);
                    System.out.println("Current Balance = " + balance);
                    break;

                case 4:
                    System.out.println("Thank you! Exiting...");
                    break;

                default:
                    System.out.println("Invalid Input!");
            }

        } while (choice != 4);

        sc.close();
    }
}