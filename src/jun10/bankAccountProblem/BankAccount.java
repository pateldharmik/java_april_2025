package jun10.bankAccountProblem;

public abstract class BankAccount {
    double balance;
    double accountNumber;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public abstract double deposit(double amount);

    public abstract double withdraw(double amount);

    public abstract void displayBalance();
}
