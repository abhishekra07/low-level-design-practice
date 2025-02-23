package Online_Shopping_Cart_System.report;

import Online_Shopping_Cart_System.Cart;

public interface ReportGenerator {
    void generateReport(Cart cart, double finalAmount);
}
