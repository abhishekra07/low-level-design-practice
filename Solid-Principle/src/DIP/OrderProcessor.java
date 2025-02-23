package DIP;

public class OrderProcessor {
    private final StockValidator stockValidator;
    private final PaymentProcessor paymentProcessor;

    // Constructor Injection
    public OrderProcessor(StockValidator stockValidator, PaymentProcessor paymentProcessor) {
        this.stockValidator = stockValidator;
        this.paymentProcessor = paymentProcessor;
    }

    public void processOrder(String itemId, double amount) {
        if (stockValidator.validateStock(itemId)) {
            paymentProcessor.processPayment(amount);
            System.out.println("Order processed successfully!");
        } else {
            System.out.println("Order failed: Item out of stock.");
        }
    }
}