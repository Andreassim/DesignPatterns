package AbstractFactory;

import java.sql.Driver;

public interface RacingFactory {

    Car createCar(String name);
    Person createDriver(String name);

}
