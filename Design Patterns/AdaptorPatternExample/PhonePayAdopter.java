public class PhonePayAdopter implements PaymentProcessor {
    
    private PhonePayGate phonePayGate;

    public PhonePayAdopter(PhonePayGate phonePayGate) {
        this.phonePayGate=phonePayGate;
    }

    @Override
    public void processPayment(double amount) {
        phonePayGate.makePay(amount);
    }
}