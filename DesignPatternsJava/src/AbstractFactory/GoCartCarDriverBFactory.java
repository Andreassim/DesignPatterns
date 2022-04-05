package AbstractFactory;

public class GoCartCarDriverBFactory implements RacingFactory{

    @Override
    public Car createCar(String name) {
        return new GoCartCar(name);
    }

    @Override
    public Person createDriver(String name) {
        return new DriverB(name);
    }
}
