package employee_management_system.employee;

import employee_management_system.compensation.Compensation;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name, int age, String role, Compensation compensation) {
        super(name, age, role, compensation);
    }
}