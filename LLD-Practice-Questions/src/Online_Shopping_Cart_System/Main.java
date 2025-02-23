package Online_Shopping_Cart_System;

import Online_Shopping_Cart_System.discount.Discount;
import Online_Shopping_Cart_System.discount.DiscountCalculator;
import Online_Shopping_Cart_System.discount.PercentageDiscount;
import Online_Shopping_Cart_System.payment.CreditCardPayment;
import Online_Shopping_Cart_System.payment.Payment;
import Online_Shopping_Cart_System.report.ReportGenerator;
import Online_Shopping_Cart_System.report.TextReportGenerator;

public class Main {
    public static void main(String[] args) {
        // 1. Create Items
        Item item1 = new Item("Laptop", 800, "Gaming Laptop");
        Item item2 = new Item("Headphones", 150, "Noise Cancelling Headphones");

        // 2. Add Items to Cart
        Cart cart = new Cart();
        cart.addItem(item1);
        cart.addItem(item2);

        // 3. Calculate Total Amount
        double totalAmount = cart.calculateTotal();
        System.out.println("Cart Total: $" + totalAmount);

        // 4. Apply Discount
        Discount discount = new PercentageDiscount(); // 10% discount
        DiscountCalculator discountCalculator = new DiscountCalculator();
        double discountedAmount = discountCalculator.calculateDiscount(discount, totalAmount);
        System.out.println("Discounted Total: $" + discountedAmount);

        // 5. Generate Report
        ReportGenerator reportGenerator = new TextReportGenerator();
        reportGenerator.generateReport(cart, discountedAmount);

        // 6. Make Payment
        Payment paymentMethod = new CreditCardPayment(); // Can also use PaypalPayment
        paymentMethod.makePayment(discountedAmount);
    }
}
