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
 

public static void main (String [] args){

}
