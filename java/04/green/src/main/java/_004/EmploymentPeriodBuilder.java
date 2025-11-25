package _004;

import java.time.LocalDate;
import java.time.YearMonth;

public class EmploymentPeriodBuilder {

    private LocalDate begin;
    private LocalDate end;
    private EmploymentPeriod.TerminationReason terminationReason;

    public EmploymentPeriod build() {
        var employmentPeriod = new EmploymentPeriod();
        employmentPeriod.begin = begin;
        employmentPeriod.end = end;
        employmentPeriod.terminationReason = terminationReason;
        return employmentPeriod;
    }

    public EmploymentPeriodBuilder begin(LocalDate begin) {
        this.begin = begin;
        return this;
    }

    public EmploymentPeriodBuilder end(LocalDate end, EmploymentPeriod.TerminationReason terminationReason) {
        this.end = end;
        this.terminationReason = terminationReason;
        return this;
    }
}
