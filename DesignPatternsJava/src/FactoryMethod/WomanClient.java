package FactoryMethod;

public class WomanClient extends Client{
    @Override
    Person create() {
        return new Woman();
    }
}
