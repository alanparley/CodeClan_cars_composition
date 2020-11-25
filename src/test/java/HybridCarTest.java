import org.junit.Before;
import org.junit.Test;
import vehicle.HybridCar;
import vehicle.components.Engine;
import vehicle.components.Tyre;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    HybridCar hybridCar;
    Engine engine;
    Tyre tyre;

    @Before
    public void before(){
        engine = new Engine (1.4);
        tyre = new Tyre("Summer", 18.00);
        hybridCar = new HybridCar("Green", 38000, engine);
        hybridCar.addTyre(tyre);
        hybridCar.addTyre(tyre);
        hybridCar.addTyre(tyre);
        hybridCar.addTyre(tyre);
    }

    @Test
    public void hasColour(){
        assertEquals("Green", hybridCar.getColour());

    }

    @Test
    public void hasPrice(){
        assertEquals(38000, hybridCar.getPrice(), 0.01);

    }

    @Test
    public void hasTyres(){
        assertEquals(4, hybridCar.getTyres().size());
    }
}
