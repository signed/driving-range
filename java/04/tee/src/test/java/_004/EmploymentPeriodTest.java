package _004;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EmploymentPeriodTest {
    @Test
    void templateTest() {
        assertThat(EmploymentPeriod.template()).isEqualTo("template");
    }
}