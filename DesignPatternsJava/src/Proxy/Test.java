package Proxy;

public class Test {
    public static void main(String[] args) {
        Person man1 = new Man("Henning");
        man1.PrintName();

        ManProxy man2 = new ManProxy("Thorbjørn");
        man2.printState();
        man2.PrintName();
        man2.printState();
    }
}
