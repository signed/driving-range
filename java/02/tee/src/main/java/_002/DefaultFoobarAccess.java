package _002;

class DefaultFoobarAccess implements  FooBarAccess{
    @Override
    public Foobar getFoobar(Entity entity) {
        return new Foobar(entity.isFoo(), entity.getBar());
    }
}
