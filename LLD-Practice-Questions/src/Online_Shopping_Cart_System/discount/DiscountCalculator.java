package Online_Shopping_Cart_System.discount;

public class DiscountCalculator {
    public double calculateDiscount(Discount discount, double totalAmount) {
        return discount.applyDiscount(totalAmount);
    }
}
