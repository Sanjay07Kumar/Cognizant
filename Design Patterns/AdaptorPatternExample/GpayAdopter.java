
public class GpayAdopter implements PaymentProcessor { 
    
    private GpayGate gpayGate;

    public GpayAdopter(GpayGate gpayGate) {
        this.gpayGate=gpayGate;
    }

    @Override
    public void processPayment(double amount) {
        gpayGate.sendPay(amount);
    }
}
