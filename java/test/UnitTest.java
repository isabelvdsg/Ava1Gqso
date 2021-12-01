

import org.junit.jupiter.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import br.com.teste.controller.Controller; 

public class UnitTest{
    @Test
    public void welcome(){
        Controller controller = new Controller();
        assertEquals("Wwlcome to the Jooby!", controller.sayHi());
    }
}
