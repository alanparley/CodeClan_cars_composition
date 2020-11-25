import org.junit.Before;
import org.junit.Test;
import vehicle.Car;
import vehicle.components.Engine;
import vehicle.components.Tyre;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;
    Engine engine;
    Tyre tyre;

    @Before
    public void before(){
        engine = new Engine (1.8);
        tyre = new Tyre("Summer", 18.00);
        car = new Car("Silver", 19000, engine);
        car.addTyre(tyre);
        car.addTyre(tyre);
        car.addTyre(tyre);
        car.addTyre(tyre);
    }
    @Test
    public void hasColour(){
        assertEquals("Silver", car.getColour());
    }

    @Test
    public void hasPrice(){
        assertEquals(19000, car.getPrice(), 0.01);

    }

    @Test
    public void hasTyres(){
        assertEquals(4, car.getTyres().size());
    }


}
