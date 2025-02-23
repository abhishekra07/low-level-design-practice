package library_management_system.latefee;

public class StandardLateFee implements LateFee {
    @Override
    public double calculateFee(long daysLate) {
        return daysLate * 1.0; // $1 per day
    }
}