import org.junit.Test;
import ysk.learning.Calc;

import static org.junit.Assert.assertEquals;

public class CalcTest {
    @Test
    public void add(){
        Calc calc = new Calc();
        assertEquals(3, calc.add(1,2));
    }
}
