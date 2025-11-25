package _004;

import java.time.LocalDate;

public class EmploymentPeriodMother {

    public static EmploymentPeriod employmentPeriodBeginsAt(LocalDate begin) {
        EmploymentPeriod employmentPeriod = new EmploymentPeriod();
        employmentPeriod.begin = begin;
        return employmentPeriod;
    }
    public static EmploymentPeriod temporaryEmploymentPeriodBeginsAt(LocalDate begin, LocalDate end, EmploymentPeriod.TerminationReason terminationReason) {
        EmploymentPeriod employmentPeriod = new EmploymentPeriod();
        employmentPeriod.begin = begin;
        employmentPeriod.end = end;
        employmentPeriod.terminationReason = terminationReason;
        return employmentPeriod;
    }
}
