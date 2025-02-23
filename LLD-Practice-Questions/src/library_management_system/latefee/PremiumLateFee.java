package library_management_system.latefee;

public class PremiumLateFee implements LateFee {
    @Override
    public double calculateFee(long daysLate) {
        return daysLate * 2.0; // $2 per day
    }
}