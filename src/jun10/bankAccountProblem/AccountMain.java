package jun10.bankAccountProblem;

public class AccountMain {
    public static void main(String[] args) {


        BankAccount sa = new SavingsAccount(1000.0);
        sa.deposit(100.0);
        sa.displayBalance();
        sa.withdraw(50.0);
        sa.displayBalance();

        System.out.println();
        BankAccount ca = new ChequingAccount(2000.0);
        ca.deposit(100.0);
        ca.displayBalance();
        ca.withdraw(50.0);
        ca.displayBalance();

        System.out.println();
        BankAccount hisa = new HighInterestSavingAccount(5000);
        hisa.deposit(100.0);
        hisa.displayBalance();
        hisa.withdraw(50.0);
        hisa.displayBalance();
    }
}
