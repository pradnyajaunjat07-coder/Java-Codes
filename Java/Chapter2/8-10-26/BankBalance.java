//Design a BankAccount class that allows money transfers between two accounts.
//Write a program to simulate these transfers and display the final balances. 

class BankAccount {

    double balance;

    void transferTo(BankAccount receiver, double amount) {

        if (amount > balance) {
            System.out.println("Amount is greater than balance.");
        }
        else {
            balance = balance - amount;
            receiver.balance = receiver.balance + amount;

            System.out.println("Transfer successful.");
        }
    }
}


public class BankBalance {

    public static void main(String[] args) {

        BankAccount a1 = new BankAccount();
        BankAccount a2 = new BankAccount();

        a1.balance = 5000;
        a2.balance = 2000;

        a1.transferTo(a2, 1000);

        a2.transferTo(a1, 500);

        System.out.println("Balance of Account 1: " + a1.balance);
        System.out.println("Balance of Account 2: " + a2.balance);
    }
}