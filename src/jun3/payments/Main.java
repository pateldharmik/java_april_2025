package jun3.payments;

public class Main {
    public static void main(String[] args) {

        Payment payment = new Payment();
        payment.pay();

        Payment ap = new ApplePay();
        ap.pay();

        Payment dc = new DebitCard();
        dc.pay();

        Payment pp = new PayPal();
        pp.pay();

        Payment upi = new UPI();
        upi.pay();
    }
}
