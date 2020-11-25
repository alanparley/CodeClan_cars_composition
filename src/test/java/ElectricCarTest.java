import org.junit.Before;
import org.junit.Test;
import vehicle.ElectricCar;
import vehicle.components.Engine;
import vehicle.components.Tyre;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;
    Engine engine;
    Tyre tyre;

    @Before
    public void before(){
        engine = new Engine(0);
        tyre = new Tyre("Summer", 18.00);
        electricCar = new ElectricCar("Red", 23000.00, engine);
        electricCar.addTyre(tyre);
        electricCar.addTyre(tyre);
        electricCar.addTyre(tyre);
        electricCar.addTyre(tyre);
    }

    @Test
    public void hasColour(){
        assertEquals("Red", electricCar.getColour());
    }

    @Test
    public void hasPrice(){
        assertEquals(23000, electricCar.getPrice(), 0.01);
    }

    @Test
    public void hasEngine(){
        assertEquals(0, electricCar.getEngine().getEngineSize(), 0.01);
    }

    @Test
    public void hasTyres(){
        assertEquals(4, electricCar.getTyres().size());

    }

}
