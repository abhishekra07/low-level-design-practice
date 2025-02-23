package employee_management_system.employee;

import employee_management_system.compensation.Compensation;

public abstract class Employee {
    public String name;
    public int age;
    public String role;
    public Compensation compensation;

    public Employee(String name, int age, String role, Compensation compensation) {
        this.name = name;
        this.age = age;
        this.role = role;
        this.compensation = compensation;
    }

    public double getCompensation() {
        return compensation.calculateCompensation();
    }
}
