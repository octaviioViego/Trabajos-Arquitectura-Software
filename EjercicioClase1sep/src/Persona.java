public abstract class Persona implements IPaciente {
    protected String nombre;
    protected String apellidoP;

     public Persona(String nombre, String apellidoP) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
    }
}
