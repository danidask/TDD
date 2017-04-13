import dask.pruebacalc.Calculadora;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by dask on 13/04/17.
 */
public class Testcalc {
    Calculadora calc = new Calculadora(2,2);

    @Test
    public void testSuma(){
        assertEquals(4, calc.suma());
    }

    @Test
    public void testResta(){
        assertEquals(0, calc.resta());
    }

    @Test
    public void restMulti(){
        assertEquals(4, calc.mult());
    }

    @Test
    public void testDiv(){
        assertEquals(1, calc.div());
    }

}
