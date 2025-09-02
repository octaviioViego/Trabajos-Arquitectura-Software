public class Estudiante extends Persona{

    private String matricula;
    //private String nombre;
    public Estudiante(String nombre, String apellidoP, String matricula){
        super(nombre, apellidoP);
        this.matricula = matricula;
    }

    @Override
    public String getIdPersona() {
        return "\nMatricula: " + matricula;
    }

    @Override
    public String getNombre() {
       return "\nNombre: "+ nombre + "\nApellido paterno: "+ apellidoP;
    }

    
}
