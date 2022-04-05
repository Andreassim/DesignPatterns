package AbstractFactory;

public class RacingGame {
    private Car car;
    private Person person;
    private RacingFactory factory;

    public RacingGame(RacingFactory factory, String carName, String driverName) {
        this.factory = factory;
        this.car = factory.createCar(carName);
        this.person = factory.createDriver(driverName);
    }

    public void test(){
        this.car.printName();
        this.person.printName();
    }
}
