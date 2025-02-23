package employee_management_system.compensation;

public class PartTimeCompensation implements Compensation {
    private double hourlyRate;

    public PartTimeCompensation(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateCompensation() {
        return hourlyRate * 160; // Assuming 160 hours a month
    }
}
