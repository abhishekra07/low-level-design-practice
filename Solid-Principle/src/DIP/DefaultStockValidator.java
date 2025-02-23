package DIP;

public class DefaultStockValidator implements StockValidator {
    @Override
    public boolean validateStock(String itemId) {
        // Assume stock validation logic here
        System.out.println("Validating stock for item: " + itemId);
        return true; // Item is in stock
    }
}