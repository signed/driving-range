package _00T;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ProductionTest {
    @Test
    void templateTest() {
        assertThat(Production.template()).isEqualTo("template");
    }
}