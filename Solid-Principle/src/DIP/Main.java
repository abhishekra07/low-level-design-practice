package DIP;

public class Main {
    public static void main(String[] args) {
        // Create concrete implementations
        StockValidator stockValidator = new DefaultStockValidator();
        PaymentProcessor paymentProcessor = new DefaultPaymentProcessor();

        // Inject dependencies into OrderProcessor
        OrderProcessor orderProcessor = new OrderProcessor(stockValidator, paymentProcessor);

        // Process an order
        orderProcessor.processOrder("ITEM123", 100.0);
    }
}