package AbstractFactory;

public class DriverA implements Person{
    private String name;

    public DriverA(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println(name + ", A-Driver");
    }
}
