// create a class named bank account with private fields for account number, holder name, & balance.
// Provide public getter & setter menthods for each field to allow controlled access & modification of the
// private fields. Implement a constructor to intialize the bank account with an account number, holder name, 
// and an intial balance. Include methods to deposite & withdraw money from the account, ensuring that the 
// balance does not go negative. In the main method, create an instance of the bank account class,
// set the account details using the constructor, & display the account number, holder name, & current balance
// of the account using the getter methods.

public class SetterGetterEx3 {
    // Private fields to ensure data encapsulation
    private String accountNumber;
    private String holderName;
    private double balance;

    // Constructor to initialize the bank account
    public SetterGetterEx3(String accountNumber, String holderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Initial balance cannot be negative. Set to 0.0");
        }
    }

    // Getter for Account Number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter for Holder Name
    public String getHolderName() {
        return holderName;
    }

    // Setter for Holder Name
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    // Getter for Balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }

    // Main method to test the BankAccount class
    public static void main(String[] args) {
        // Creating a new bank account
        SetterGetterEx3 account = new SetterGetterEx3("987654321", "Pradnya Jaunjat", 500000);

        // Displaying only the requested account details
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder: " + account.getHolderName());
        System.out.println("Current Balance: " + account.getBalance());
    }
}
