package AbstractFactory;

public class RacingCar implements Car{
    private String name;

    public RacingCar(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println(name + ", Racing Car");
    }
}
