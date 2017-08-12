package _001;

import java.util.ArrayList;
import java.util.Optional;

class Mapper {

    TransferObject toTransferObject(Entity entity) {
        TransferObject transferObject = new TransferObject();
        transferObject.one = new PartOne();
        transferObject.one.foo = entity.foo;
        transferObject.one.bar = entity.bar;
        transferObject.two = new PartTwo();
        transferObject.two.baz = Optional.ofNullable(entity.baz).map(ArrayList::new).orElse(null);
        transferObject.two.qux = entity.qux;
        return transferObject;
    }

}
