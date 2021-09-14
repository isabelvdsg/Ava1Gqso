package app;

import io.jooby.annotations.*;
import io.jooby.exception.*;
 

public class Soma {
    @Path("/soma/{a}/{b}")
    @GET
    public String rotaSoma(@PathParam String a,@PathParam String b){
        try{
        double var1 = Double.parseDouble(a);
        double var2 = Double.parseDouble(b);
        double soma = var1 + var2;

        return String.format("%.2f", soma);
        } catch(NumberFormatException nfe){
            throw new BadRequestException(String.format("Números invalidos:\"%s %s\"", a, b));
        }
    }
}

/*import java.util.Scanner; 

public class somap {
    Run | Debug 
    public static void main (String [ args]){
        double a, b, c = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite os numeros");
        a = s.nextDouble();
        b = s.nextDouble();
        c = a + b;
        System.out.println("A soma e:" + c);
    }
}*/