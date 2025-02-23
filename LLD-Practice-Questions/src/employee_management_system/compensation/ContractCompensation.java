package employee_management_system.compensation;

public class ContractCompensation implements Compensation {
    private double monthlyRate;

    public ContractCompensation(double monthlyRate) {
        this.monthlyRate = monthlyRate;
    }

    @Override
    public double calculateCompensation() {
        return monthlyRate;
    }
}