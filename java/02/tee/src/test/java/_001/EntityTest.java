package _001;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

class EntityTest {

    @Test
    void getQux() {
        Entity entity = new Entity();
        entity.qux = 42;
        assertThat(entity.getQux(), equalTo(42));
    }

    @Test
    void mapBaz() {
        Entity entity = new Entity();
        entity.baz = newArrayList("one", "two", "three");

        assertThat(entity.getBaz(), equalTo(newArrayList("one", "two", "three")));
    }

    @Test
    void mapFoo() {
        Entity entity = new Entity();
        entity.foo = true;

        final var foobar = new DefaultFoobarAccess().getFoobar(entity);
        assertThat("true should be copied from the entity", foobar.foo());
    }

    @Test
    void mapBar() {
        Entity entity = new Entity();
        entity.bar = 42L;

        final var foobar = new DefaultFoobarAccess().getFoobar(entity);
        assertThat(foobar.bar(), equalTo(42L));
    }

    private List<String> newArrayList(String... elements) {
        return new ArrayList<>(Arrays.asList(elements));
    }
}
