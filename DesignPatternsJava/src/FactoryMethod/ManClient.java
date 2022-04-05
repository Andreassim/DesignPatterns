package FactoryMethod;

public class ManClient extends Client{
    @Override
    Person create() {
        return new Man();
    }
}
