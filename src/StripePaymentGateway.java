public class StripePaymentGateway implements PaymentGatewayStrategy {
    @Override
    public void processPayment(double amount) {

        System.out.println("Processing payment using Stripe Gateway: $" + amount);
    }
}
