package _001;

import java.util.ArrayList;
import java.util.Optional;

class Mapper {

    TransferObject toTransferObject(Entity entity) {
        TransferObject transferObject = new TransferObject();
        transferObject.one = derivePartOneFrom(entity);
        transferObject.two = derivePartTwoFrom(entity);
        return transferObject;
    }

    public PartOne derivePartOneFrom(Entity entity) {
        PartOne one = new PartOne();
        one.foo = entity.foo;
        one.bar = entity.bar;
        return one;
    }

    public PartTwo derivePartTwoFrom(Entity entity) {
        PartTwo two = new PartTwo();
        two.baz = Optional.ofNullable(entity.baz).map(ArrayList::new).orElse(null);
        two.qux = entity.qux;
        return two;
    }

}
