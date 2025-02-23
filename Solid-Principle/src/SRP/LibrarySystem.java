package SRP;

public class LibrarySystem {
    public static void main(String[] args) {
        // Example usage of HandleBookOverdues
        OverdueFeeCalculator overdueHandler = new OverdueFeeCalculator();
        int overdueDays = 5; // Example: book is overdue by 5 days
        double fee = overdueHandler.calculateOverdueFee(overdueDays);
        System.out.println("Overdue fee for " + overdueDays + " days: $" + fee);

        // Example usage of GenerateReport
        MonthlyReportGenerator reportGenerator = new MonthlyReportGenerator();
        reportGenerator.generateMonthlyReport();
    }
}
