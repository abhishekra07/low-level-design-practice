package Online_Shopping_Cart_System.discount;

public class FlatDiscount implements Discount {
    @Override
    public double applyDiscount(double amount) {
        return amount - 100; // Flat $100 discount
    }
}
