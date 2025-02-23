package Online_Shopping_Cart_System.discount;

public class PercentageDiscount implements Discount {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.90; // Apply 10% discount
    }
}