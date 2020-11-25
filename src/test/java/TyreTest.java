import org.junit.Before;
import org.junit.Test;
import vehicle.components.Tyre;

import static org.junit.Assert.assertEquals;

public class TyreTest {

    Tyre tyre;

    @Before
    public void before(){
        tyre = new Tyre("Summer", 18.00);
    }

    @Test
    public void hasType(){
        assertEquals("Summer", tyre.getType());
    }

    @Test
    public void hasDiameter(){
        assertEquals(18.00, tyre.getDiameter(), 0.01);
    }

}
