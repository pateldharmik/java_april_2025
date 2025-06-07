package jun3.payments;

public class DebitCard extends Payment{

    public void pay(){
        System.out.println("Debit Card has been inserted for the payment.");
    }

    public void creditCard(){
        System.out.println("Credit Card has been inserted for the payment.");
    }
}
