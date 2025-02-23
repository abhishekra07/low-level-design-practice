package employee_management_system.compensation;

public class FullTimeCompensation implements Compensation {
    private double annualPackage;

    public FullTimeCompensation(double annualPackage) {
        this.annualPackage = annualPackage;
    }

    @Override
    public double calculateCompensation() {
        return annualPackage;
    }
}