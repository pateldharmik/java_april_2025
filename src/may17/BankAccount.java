package may17;

public class BankAccount {
    String accountHolderName;
    String accountNumber;
    double balance;

    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    void deposit(double amount){
        balance = balance + amount;
        System.out.println("Deposit successful. Balance is: " + balance );
    }

    void withdraw(double amount){
        if((balance - amount) < 0){
            System.out.println("Insufficient balance");
        }else{
            balance = balance - amount;
            System.out.println("Withdrawal successful. Balance is: " + balance);
        }
    }

    void displayAccountInfo(){
        System.out.println("Account holder name: " + accountHolderName);
        System.out.println("Account number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
