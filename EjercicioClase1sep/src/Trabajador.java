public abstract class Trabajador extends Persona {
    String numEmpleado;
    
    public Trabajador(String nombre, String apellidoP , String numEmpleado) {
        super(nombre, apellidoP);
        this.numEmpleado = numEmpleado;
        
    }
    
}
