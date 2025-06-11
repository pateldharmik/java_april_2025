package jun10.bankAccountProblem;

public class HighInterestSavingAccount extends BankAccount {
    public HighInterestSavingAccount(double balance) {
        super(balance);
    }

    @Override
    public double deposit(double amount) {
        balance = balance + amount + (balance * 0.250);
        return balance;

    }

    @Override
    public double withdraw(double amount) {
        balance = balance - amount;
        return balance - amount;
    }

    @Override
    public void displayBalance() {
        System.out.println("The current balance of the High Interest Savings Account is: " + balance + "$.");
    }
}
