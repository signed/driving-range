package _003;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;

class BillboardGreetingTest {

    final InMemoryDisplay display = new InMemoryDisplay();

    @Test
    void composeGreetingForJohn() {
        bookGreetingFor("John");
        assertThat(display.shownMessages(), hasItems("Hello John, hope you have a great day"));
    }

    @Test
    void composeGreetingAnne() {
        bookGreetingFor("Anne");
        assertThat(display.shownMessages(), hasItems("Hello Anne, hope you have a great day"));
    }

    private void bookGreetingFor(String john) {
        new Billboard(display).greet(john);
    }

}
