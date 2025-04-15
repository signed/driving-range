package _003;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;

class BillboardWarningTest {

    final InMemoryDisplay display = new InMemoryDisplay();

    @Test
    void composeTemperatureWarning() {
        warnAbout("High Temperature");
        assertThat(display.shownMessages(), hasItems("❗High Temperature Warning❗"));
    }

    @Test
    void composeStormWarning() {
        warnAbout("Storm");
        assertThat(display.shownMessages(), hasItems("❗Storm Warning❗"));
    }

    private void warnAbout(String topic) {
        new Billboard(display).warn(topic);
    }

}
