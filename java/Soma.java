package app;

public class Soma{
    
    public String rotaSoma(String a, String b) throws Exception{
        try{
        double var1 = Double.parseDouble(a);
        double var2 = Double.parseDouble(b);
        double soma = var1 + var2;

        return String.format("%.2f", soma);
        } catch(NumberFormatException nfe){
            throw new Exception(String.format("Números invalidos:\"%s %s\"", a, b));
        }
    }
 

public static void main (String [] args) throws Exception{
    Soma sum = new Soma();
    String a = "1", b = "2";
    String resultado = sum.rotaSoma(a, b);

    System.out.print(resultado);

}
} 
