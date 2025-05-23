package may17;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bankaccount = new BankAccount("Account Holder Name","123456789");

        bankaccount.deposit(1000);
        bankaccount.withdraw(500);
        bankaccount.withdraw(1000);
        bankaccount.displayAccountInfo();
    }
}
