public class Mastercard implements MetodoPago{

    private String numCuenta;
    private String fechaVencimiento;
    private String codSeguridad;  

    public Mastercard(String numCuenta, String fechaVencimiento, String codSeguridad) {
        this.numCuenta = numCuenta;
        this.fechaVencimiento = fechaVencimiento;
        this.codSeguridad = codSeguridad;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Procesando pago con Mastercard......");
        System.out.println("Número de cuenta: ..###-###" + numCuenta.substring(7));
        System.out.println("Fecha de vencimiento: "+ fechaVencimiento);
        System.out.println("Código de seguridad: " + codSeguridad );
        System.out.println("Monto:"+monto);
        System.out.println("¡Cobro Exitoso!");
    }

     
}