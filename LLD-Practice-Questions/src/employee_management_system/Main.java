package employee_management_system;

import employee_management_system.compensation.ContractCompensation;
import employee_management_system.compensation.FullTimeCompensation;
import employee_management_system.compensation.PartTimeCompensation;
import employee_management_system.employee.ContractEmployee;
import employee_management_system.employee.Employee;
import employee_management_system.employee.FullTimeEmployee;
import employee_management_system.employee.PartTimeEmployee;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("Abhishek", 30, "Developer", new FullTimeCompensation(80000));
        Employee emp2 = new PartTimeEmployee("Rahul", 28, "Tester", new PartTimeCompensation(40000));
        Employee emp3 = new ContractEmployee("Ajay", 32, "Manager", new ContractCompensation(60000));

        System.out.println(emp1.getCompensation());
        System.out.println(emp2.getCompensation());
        System.out.println(emp3.getCompensation());
    }
}