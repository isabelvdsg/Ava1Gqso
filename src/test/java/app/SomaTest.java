package app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;

public class SomaTest {
    Soma t;

    @BeforeEach
    public void setup() {
        t = new Soma();
    }
    @Test
    public void testSoma_ok() {
        assertEquals(25.9, t.somaDois("12.7", "13.2"));

    }
    @Test
    public void testSomaLetras() {
        assertThrows(IllegalArgumentException.class, ()->{
            t.somaDois("a", "b");
        });
    }


}
