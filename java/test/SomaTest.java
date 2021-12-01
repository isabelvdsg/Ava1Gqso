
import java.beans.Transient;

import org.junit.jupiter.api.Assertions.assertEquals;

public class SomaTest {
    @Test
    public void testSoma_sucess(){
        Soma sum1 = new Soma();
        assertEquals(1, 2, sum1.rotaSoma(3.));
    }
}
