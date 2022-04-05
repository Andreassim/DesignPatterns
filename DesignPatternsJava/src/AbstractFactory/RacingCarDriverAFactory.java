package AbstractFactory;

public class RacingCarDriverAFactory implements RacingFactory{

    @Override
    public Car createCar(String name) {
        return new RacingCar(name);
    }

    @Override
    public Person createDriver(String name) {
        return new DriverA(name);
    }
}
