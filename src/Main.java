public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = PaymentProcessor.getInstance();


        paymentProcessor.processPayment(200.00);


        paymentProcessor.setPaymentGatewayStrategy(new StripePaymentGateway());
        paymentProcessor.processPayment(75.50);
    }
}
