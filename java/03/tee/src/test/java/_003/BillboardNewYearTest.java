package _003;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;

class BillboardNewYearTest {
    final InMemoryDisplay display = new InMemoryDisplay();

    @Test
    void happyNewYear2025() {
        happyNewYearOf(2025);
        assertThat(display.shownMessages(), hasItems("Happy New Year!\n2025"));
    }

    @Test
    void happyNewYear2000() {
        happyNewYearOf(2000);
        assertThat(display.shownMessages(), hasItems("Happy New Year!\n2000"));
    }

    private void happyNewYearOf(int year) {
        new Billboard(display).happyNewYear(year);
    }
}
