package DIP;

public class DefaultPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        // Assume payment processing logic here
        System.out.println("Processing payment of $" + amount);
    }
}