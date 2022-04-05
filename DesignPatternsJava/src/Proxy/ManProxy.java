package Proxy;

public class ManProxy implements Person{
    private String name;
    private Man man;

    public ManProxy(String name) {
        this.name = name;
    }

    @Override
    public void PrintName() {
        if(man == null){
            man = new Man(name); // Load from db or something
        }
        man.PrintName();
    }

    public void printState(){
        if(man == null){
            System.out.println("No man");
        }else {
            System.out.println("Man!");
        }
    }

}
