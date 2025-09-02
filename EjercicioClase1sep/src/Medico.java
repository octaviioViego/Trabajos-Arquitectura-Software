public class Medico extends Trabajador {

    private final String numCelula;

    public Medico(String nombre, String apellidoP, String numEmpleado, String numCelula) {
        super(nombre, apellidoP, numEmpleado);
        
        if(numCelula == null || numCelula == "")
          throw new IllegalArgumentException("No se puede crear un objeto medico sin numero de celula.");
       
        this.numCelula = numCelula;
    }

    @Override
    public String getIdPersona() {
        return "\nNúmero de trabajador: " + this.numEmpleado ;
    }

    @Override
    public String getNombre() {
        return "\nNombre: " + this.nombre + "\nApellido paterno: " + this.apellidoP;
    }

    public String getNumCelula() {
        return "\nNúmero de celula profecional: " + numCelula;
    }
    
    


}
