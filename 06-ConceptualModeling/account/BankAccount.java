package account;

public class BankAccount {
    public double balance;
    public String accountNumber;
    public String bankName;
    public String owner;
    public boolean isDebit;

    public BankAccount(double balance, String accountNumber, String bankName, String owner, boolean isDebit) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.bankName = bankName;
        this.owner = owner;
        this.isDebit = isDebit;
    }

    public void displayBalance(String accountNumber) {
        System.out.println("Current balance for " + accountNumber + " is: " + balance);
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Successful deposit!");
    }

    public void withdraw(double amount) {
        if (isDebit & this.balance < amount) {
            System.out.println("Insuficent Funds!");
        } else if (amount >= 500.0) {
            System.out.println("Max allowed amount to be withdrawn is 500!");
        } else {
            this.balance -= amount;
            System.out.println("Successful withdraw!");
        }
    }
}
