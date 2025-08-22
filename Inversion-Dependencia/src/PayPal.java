public class PayPal implements MetodoPago {
    private String email;

    public PayPal(String email){
        this.email = email;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Procesando pago con PayPal......");
        System.out.println("Email: " + email.substring(0, 4) + "...#######.com");
        System.out.println("Monto:"+monto);
        System.out.println("¡Cobro Exitoso!");
    }
    
}
