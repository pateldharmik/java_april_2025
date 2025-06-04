package jun3.payments;

public class UPI extends Payment{
    @Override
    public void pay() {
        System.out.println("Barcode has been scanned for UPI payment.");
    }
}
