package jun3.payments;

public class Main {
    public static void main(String[] args) {

        Payment payment = new Payment();
        payment.pay();

        Payment ap = new ApplePay();
        ap.pay();

        Payment dc = new DebitCard();
        dc.pay();
        //dc.creditCard();
        /*  QUESTION FOR TOMORROW, IF WE HAVE A OBJECT OF DEBITCARD CLASS, THEY WHY CAN WE NOT CALL THE DEBITCARD METHOD IF WE ARE USING PARENT CLASS REFERENCE*/

        Payment pp = new PayPal();
        pp.pay();

        Payment upi = new UPI();
        upi.pay();
    }
}
