package account;

public class PersonalAccount extends BankAccount {

    public PersonalAccount(double balance, String accountNumber, String bankName, String owner, boolean isDebit) {
        super(balance, accountNumber, bankName, owner, isDebit);
    }

    public void makeTransit(double amount, String targetAccountNumber, String priority) {

    }
}

