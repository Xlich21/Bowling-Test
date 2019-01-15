import org.junit.Test;

import static org.junit.Assert.*;

public class MathTest {

    @Test
    public void avg() {
        Math m = new Math();
        assertEquals(m.avg(2,2), 2, 0.0000001);
        assertEquals(m.avg(1,2), 1.5, 0.0000001);
        assertEquals(m.avg(0,0), 0, 0.0000001);


    }
}