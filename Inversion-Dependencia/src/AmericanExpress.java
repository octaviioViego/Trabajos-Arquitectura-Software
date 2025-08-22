public class AmericanExpress implements MetodoPago{
    private String numTarjeta;
    private String numReferenciaPago;
    
    public AmericanExpress(String numTarjeta, String numReferenciaPago) {
        this.numTarjeta = numTarjeta;
        this.numReferenciaPago = numReferenciaPago;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Procesando pago con AmericanExpress......");
        System.out.println("Número de cuenta: ###-###" + numTarjeta.substring(7));
        System.out.println("Número de referencia de pago: "+ numReferenciaPago);
        System.out.println("Monto:"+monto);   
        System.out.println("¡Cobro Exitoso!"); 
    }

}
    

