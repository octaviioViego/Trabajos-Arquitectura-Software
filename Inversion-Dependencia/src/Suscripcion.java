public class Suscripcion {
    private MetodoPago pago;
    private double monto = 99.99;
    private boolean activada;
   
    /*
     * La inyección de dependencia esta en el constructor cuando se pasa el objeto MetodoPago pago.
     */
    public Suscripcion(MetodoPago pago) {
        this.pago = pago;
        this.activada = false;
    }

    public void renovarSuscripcion(){
        System.out.println("Renovando o Creando suscripción...");
        pago.pagar(this.monto);
        activada = true;
    }

    public void cobrarMensualidad(){
        System.out.println("Cobrando mensualidad...");
        pago.pagar(this.monto);
        activada = true;
    }

    public void cancelar(){
        this.activada = false;
        System.out.println("Suscripción desactivada.");
    }

    public boolean isActivada() {
        return activada;
    }

}
