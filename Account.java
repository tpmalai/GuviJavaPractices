package GuviJavaPractices3;

public class Account {
    private double balance;
    public Account() {
        this.balance = 0.0;
    }
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance to withdraw $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount. Please enter a positive value.");
        }
    }
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Account account1 = new Account();
        System.out.println("Account 1 - Initial Balance: $" + account1.getBalance());
        account1.deposit(100.0);
        account1.withdraw(50.0);
        System.out.println("Account 1 - Current Balance: $" + account1.getBalance());
        Account account2 = new Account(500.0);
        System.out.println("Account 2 - Initial Balance: $" + account2.getBalance());
        account2.deposit(200.0);
        account2.withdraw(300.0);
        System.out.println("Account 2 - Current Balance: $" + account2.getBalance());
    }
}
