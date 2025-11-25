package _004;

public class EmployeeMother {
    public static Employee employee(EmploymentPeriodBuilder employmentPeriod) {
        return new Employee(employmentPeriod.build());
    }
}
