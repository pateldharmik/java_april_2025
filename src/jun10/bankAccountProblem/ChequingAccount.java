package jun10.bankAccountProblem;

public class ChequingAccount extends BankAccount {
    public ChequingAccount(double balance) {
        super(balance);
    }

    @Override
    public double deposit(double amount) {
        balance = balance + amount;
        return balance;
    }

    @Override
    public double withdraw(double amount) {
        balance = balance - amount;
        return balance;
    }

    @Override
    public void displayBalance() {
        System.out.println("The current balance for the Chequing account is:" + balance + "$.");
    }
}
