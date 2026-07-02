
public class AdopterPatternTest {
    public static void main(String [] args) {

        PaymentProcessor phonepay = new PhonePayAdopter(new PhonePayGate());
        PaymentProcessor gpay = new GpayAdopter(new GpayGate());

        phonepay.processPayment(1000);
        gpay.processPayment(5000);
    }
}