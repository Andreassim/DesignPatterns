package AbstractFactory;

public class DriverB implements Person{
    private String name;


    public DriverB(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println(name + ", B-Driver");
    }
}
