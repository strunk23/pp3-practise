package account;

public class SavingsAccount extends PersonalAccount {

    double interestRate;
    int maxAmountOfTransactions;
    double savingsBalance;

    public SavingsAccount(double balance, String accountNumber, String bankName, String owner, boolean isDebit) {
        super(balance, accountNumber, bankName, owner, isDebit);
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setMaxAmountOfTransactions(int maxAmountOfTransactions) {
        this.maxAmountOfTransactions = maxAmountOfTransactions;
    }

    public void transferToSavingsAccount(double amount) {
        this.savingsBalance += amount;
        this.balance -= amount;
    }

    public void transferFromSavingsAccount(double amount) {
        if ((this.savingsBalance -= amount) >= 0) {
            this.savingsBalance -= amount;
            this.balance += amount;
        } else {
            System.out.println("Insufficient funds on the savings account!");
        }
    }
}
