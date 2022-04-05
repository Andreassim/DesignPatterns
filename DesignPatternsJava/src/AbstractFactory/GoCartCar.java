package AbstractFactory;

public class GoCartCar implements Car{
    private String name;

    public GoCartCar(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println(name + ", GoCart Car");
    }
}
