package FactoryMethod;

public class Test {
    public static void main(String[] args) {
        Client client1 = new Client("Man");
        Client client2 = new Client("Woman");

        client1.printGender();
        client2.printGender();
    }
}
