package FactoryMethod;

public class Test {

    public static Client client;
    public static String config = "Man!";

    public static void main(String[] args) {
        configure();
        start();
    }

    static void configure() {
        if (config == "Man") {
            client = new ManClient();
        } else {
            client = new WomanClient();
        }
    }

    static void start(){
        client.printGender();
    }
}
