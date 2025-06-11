package jun10.bankAccountProblem;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public double deposit(double amount) {
        balance = balance + amount + (0.025 * balance);
        return balance;
    }

    @Override
    public double withdraw(double amount) {
        balance = balance - amount;
        return balance - amount;
    }

    @Override
    public void displayBalance() {
        System.out.println("The current balance for the Savings account is: " + balance + "$.");
    }
}
