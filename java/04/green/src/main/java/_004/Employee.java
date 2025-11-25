package _004;

import java.time.LocalDate;
import java.util.Optional;

public class Employee {
    public final EmploymentPeriod employmentPeriod;

    public Employee(EmploymentPeriod employmentPeriod) {
        this.employmentPeriod = employmentPeriod;
    }

    public boolean isEmployedAt(LocalDate date) {
        var afterOrAtBegin = this.employmentPeriod.begin.isBefore(date) || this.employmentPeriod.begin.isEqual(date);
        var notTerminated = Optional.ofNullable(this.employmentPeriod.end).map(end -> end.isEqual(date) || end.isAfter(date)).orElse(true);
        return afterOrAtBegin && notTerminated;
    }
}
