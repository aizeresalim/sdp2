public class PayPalPaymentGateway implements PaymentGatewayStrategy {
    @Override
    public void processPayment(double amount) {

        System.out.println("Processing payment using PayPal Gateway: $" + amount);
    }
}
