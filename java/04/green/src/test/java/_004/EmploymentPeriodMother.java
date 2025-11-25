package _004;

import java.time.LocalDate;

public class EmploymentPeriodMother {

    public static EmploymentPeriodBuilder employmentPeriodBeginsAt(LocalDate begin) {
        return new EmploymentPeriodBuilder().begin(begin);
    }
    public static EmploymentPeriodBuilder temporaryEmploymentPeriodBeginsAt(LocalDate begin, LocalDate end, EmploymentPeriod.TerminationReason terminationReason) {
        return employmentPeriodBeginsAt(begin).end(end, terminationReason);
    }
}
