package Online_Shopping_Cart_System.report;

import Online_Shopping_Cart_System.Cart;
import Online_Shopping_Cart_System.Item;

public class TextReportGenerator implements ReportGenerator {
    @Override
    public void generateReport(Cart cart, double finalAmount) {
        System.out.println("\n===== Purchase Report =====");
        System.out.println("Items in Cart:");
        for (Item item : cart.getItems()) {
            System.out.println("- " + item.getName() + ": $" + item.getPrice());
        }
        System.out.println("Total Amount (after discount): $" + finalAmount);
        System.out.println("===========================");
    }
}