// Create a "BankAccount" class that supports deposits, withdrawals, and balance enquiries.

import java.util.Scanner;

class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    // Constructor
    BankAccount(String accountHolder, int accountNumber,
                double initialBalance) {
        if (accountHolder.trim().isEmpty() ||
            accountNumber <= 0 || !Double.isFinite(initialBalance) ||
            initialBalance < 0) {
            throw new IllegalArgumentException(
                "Invalid account details or initial balance."
            );
        }

        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Deposit money
    void deposit(double amount) {
        if (!Double.isFinite(amount) || amount <= 0) {
            System.out.println("Invalid deposit amount.");
        } else if (!Double.isFinite(balance + amount)) {
            System.out.println("Deposit amount is too large.");
        } else {
            balance = balance + amount;
            System.out.println("Deposit Successful");
        }
    }

    // Withdraw money
    void withdraw(double amount) {
        if (!Double.isFinite(amount) || amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawal Successful");
        }
    }

    // Display account information and final balance
    void displayAccount() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Final Balance: " + balance);
    }
}

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Account Holder: ");
            String name = sc.nextLine();

            System.out.print("Account Number: ");
            int accountNumber = Integer.parseInt(sc.nextLine());

            System.out.print("Initial Balance: ");
            double initialBalance =
                Double.parseDouble(sc.nextLine());

            BankAccount account =
                new BankAccount(name, accountNumber, initialBalance);

            System.out.print("Deposit: ");
            double depositAmount =
                Double.parseDouble(sc.nextLine());
            account.deposit(depositAmount);

            System.out.print("Withdrawal: ");
            double withdrawalAmount =
                Double.parseDouble(sc.nextLine());
            account.withdraw(withdrawalAmount);

            account.displayAccount();

        } catch (NumberFormatException e) {
            System.out.println("Please enter valid numeric values.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
