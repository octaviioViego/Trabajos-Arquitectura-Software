public class Maestro extends Trabajador {

    private String numCelula;

    public Maestro(String nombre, String apellidoP, String numEmpleado, String numCelula) {
        super(nombre, apellidoP, numEmpleado); 
        this.numCelula = numCelula;
    }

    @Override
    public String getIdPersona() {
        return "\nEl número de trabajador es:" + numEmpleado;
    }

    @Override
    public String getNombre() {
        return "\nNombre: " + nombre + "\nApellido paterno: " + apellidoP ;
    }

    public String getCelula(){
        return "Número de celula: " + numCelula;
    }
    
    
}
