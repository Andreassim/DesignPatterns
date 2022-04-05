package Proxy;

public class Man implements Person{
    private String name;

    public Man(String name) {
        this.name = name;
    }

    @Override
    public void PrintName() {
        System.out.println(name);
    }
}
