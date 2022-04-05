package AbstractFactory;

public interface RacingFactory {

    Car createCar(String name);
    Person createDriver(String name);

}
