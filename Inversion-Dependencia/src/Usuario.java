public class Usuario {
    private String nombre;
    private String apellidoPaterno;
    private MetodoPago metodoPago;
    private Suscripcion suscripcion;
    

    public Usuario(String nombre, String apellidoPaterno, MetodoPago metodoPago) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.metodoPago = metodoPago;
    }


    public Suscripcion creaSuscripcion(){
        this.suscripcion = new Suscripcion(metodoPago); 
        this.suscripcion.renovarSuscripcion();
        return this.suscripcion;
    }

    public boolean isSuscripcionActiva() {
        return this.suscripcion != null && this.suscripcion.isActivada();
    }

    public void cancelarSuscripcion() {
        if (this.suscripcion != null) {
            this.suscripcion.cancelar();
        }
    }


    public String getNombre() {
        return nombre;
    }


    public String getApellidoPaterno() {
        return apellidoPaterno;
    }


    public Suscripcion getSuscripcion() {
        return suscripcion;
    }


    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    
    

    
}


