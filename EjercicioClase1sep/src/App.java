public class App {
    public static void main(String[] args) throws Exception {
        Estudiante estudiante = new Estudiante("Octavio", "Arroyo", "19-003-0088");
        
        Maestro maestro = new Maestro("Jose", "Quiroz", "Q12374J789uacm", "");

        Medico medico = new Medico("Brian", "Maldonado", "Medico123UACM789", "ASD123DSA41");
        
        System.out.println(estudiante.getIdPersona());
        System.out.println(estudiante.getNombre());

        System.out.println(maestro.getIdPersona());
        System.out.println(maestro.getNombre());
        System.out.println(maestro.getCelula());

        System.out.println(medico.getIdPersona());
        System.out.println(medico.getNombre());
        System.out.println(medico.getNumCelula());


    }
}
