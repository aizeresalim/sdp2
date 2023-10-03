public class PaymentProcessor {
    private static PaymentProcessor instance;
    private PaymentGatewayStrategy strategy;

    private PaymentProcessor() {

        strategy = new PayPalPaymentGateway();
    }

    public static PaymentProcessor getInstance() {
        if (instance == null) {
            instance = new PaymentProcessor();
        }
        return instance;
    }

    public void setPaymentGatewayStrategy(PaymentGatewayStrategy strategy) {
        this.strategy = strategy;
    }

    public void processPayment(double amount) {
        strategy.processPayment(amount);
    }
}

