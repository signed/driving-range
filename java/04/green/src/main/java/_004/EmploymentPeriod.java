package _004;

import java.time.LocalDate;
import java.time.YearMonth;

public class EmploymentPeriod {

    public enum TerminationReason{
        EmployeeQuit,
    }

    public LocalDate begin;
    public LocalDate end;
    public TerminationReason terminationReason;


    public static String template() {
        return "template";
    }
}
