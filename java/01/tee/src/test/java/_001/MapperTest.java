package _001;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

class MapperTest {

    @Test
    void mapQux() {
        Entity entity = new Entity();
        entity.qux = 42;
        TransferObject transferObject = new Mapper().toTransferObject(entity);

        assertThat(transferObject.two.qux, equalTo(42));
    }

    @Test
    void makeADefensiveCopyOfBaz() {
        Entity entity = new Entity();
        entity.baz = newArrayList();
        TransferObject transferObject = new Mapper().toTransferObject(entity);

        entity.baz.add("should not show up in the transfer object");

        assertThat(transferObject.two.baz, equalTo(newArrayList()));
    }

    @Test
    void mapBaz() {
        Entity entity = new Entity();
        entity.baz = newArrayList("one", "two", "three");

        assertThat(entity.baz, equalTo(newArrayList("one", "two", "three")));
    }

    @Test
    void mapFoo() {
        Entity entity = new Entity();
        entity.foo = true;
        TransferObject transferObject = new Mapper().toTransferObject(entity);

        assertThat("true should be copied from the entity", transferObject.one.foo);
    }

    @Test
    void mapBar() {
        Entity entity = new Entity();
        entity.bar = 42L;
        TransferObject transferObject = new Mapper().toTransferObject(entity);

        assertThat(transferObject.one.bar, equalTo(42L));
    }


    private List<String> newArrayList(String... elements) {
        return new ArrayList<>(Arrays.asList(elements));
    }
}
