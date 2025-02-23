package SRP;

public class OverdueFeeCalculator {
    private static final double DAILY_FINE = 1.5; // Fine per day in currency

    // Method to calculate overdue fee
    public double calculateOverdueFee(int overdueDays) {
        return overdueDays * DAILY_FINE;
    }
}
