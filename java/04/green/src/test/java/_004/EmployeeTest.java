package _004;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static _004.EmployeeMother.employee;
import static _004.EmploymentPeriod.TerminationReason.EmployeeQuit;
import static _004.EmploymentPeriodMother.employmentPeriodBeginsAt;
import static _004.EmploymentPeriodMother.temporaryEmploymentPeriodBeginsAt;
import static org.assertj.core.api.Assertions.assertThat;

class EmployeeTest {
    @Test
    void isEmployedStartingWithTheFirstDay() {
        var firstDay = LocalDate.of(2020, 1, 1);
        var employmentPeriod = employmentPeriodBeginsAt(firstDay);
        var employee = employee(employmentPeriod);

        assertThat(employee.isEmployedAt(firstDay.minusDays(1))).isFalse();
        assertThat(employee.isEmployedAt(firstDay)).isTrue();
    }

    @Test
    void isStillEmployedOnTerminationDay() {
        var firstDay = LocalDate.of(2020, 1, 1);
        var lastDay = LocalDate.of(2020, 1, 31);
        var employmentPeriod = temporaryEmploymentPeriodBeginsAt(firstDay, lastDay, EmployeeQuit);
        var employee = employee(employmentPeriod);

        assertThat(employee.isEmployedAt(lastDay.minusDays(1))).isTrue();
        assertThat(employee.isEmployedAt(lastDay)).isTrue();
        assertThat(employee.isEmployedAt(lastDay.plusDays(1))).isFalse();
    }
}