package FactoryMethod;

public abstract class Client {
    private Person person;

    public void printGender(){
        person = create();
        person.PrintGender();
    }

    abstract Person create();
}
