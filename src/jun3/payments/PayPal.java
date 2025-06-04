package jun3.payments;

public class PayPal extends Payment {
    @Override
    public void pay() {
        System.out.println("PayPal credentials has been used for the payment");
    }
}
