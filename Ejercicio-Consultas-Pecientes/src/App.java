import java.util.ArrayList;

import com.arquitectura.consultorio.enums.Genero;
import com.arquitectura.consultorio.interfaces.IPaciente;
import com.arquitectura.consultorio.model.Consulta;
import com.arquitectura.consultorio.model.Estudiante;
import com.arquitectura.consultorio.model.Expediente;
import com.arquitectura.consultorio.model.Medico;
import com.arquitectura.consultorio.model.PacienteEstudiante;
import com.arquitectura.consultorio.model.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        //Creamos un objeto de tipo persona
        Persona per1 = new Persona("Kurt", "Donail","Cobain", "5513127578", 27,Genero.Masculino);
        Persona per2 = new Persona("Leonardo", "Rodriguez","Rodriguez", "5513120033", 23,Genero.Masculino);
        Persona per3 = new Persona("Ozzy", "Black", "Osbourne", "5512135464", 40 ,Genero.Masculino);
        
        Estudiante est1 = new Estudiante("19-003-0088", per1);
        Estudiante est2 = new Estudiante("21-003-0008", per2);
        

        String kurt = est1.getPersona().getNombre();
        String leonardo = est2.getPersona().getNombre();
        
        System.out.println("Nombre de la persona es: " + kurt);
        System.out.println("Nombre de la persona es: " + leonardo);

        //Creamos un objeto tipo madico
        Medico medico = new Medico("Empleado123num", "Celula123Medico321Ejemplo",per3);
        System.out.println(medico.toString());

        //Creamos un objeto paciente
        String matriculaLeo = est1.getMatricula();
        IPaciente paciente = new PacienteEstudiante(matriculaLeo);
        
        
        //Creamos objetos tipo Expediente y Consulta 
        Expediente expediente = new Expediente(paciente);
        Consulta consulta = new Consulta("68", 1.70, "Al paciente tiene un fuerte dolor de la cabeza",
                                        "Migraña", "Dos pastillas de ibuprofeno", medico.getIdMedico());

        expediente.agregarConsulta(consulta);

        ArrayList<Consulta> listaConsultas = expediente.getConsultas(); 
        for (Consulta consultas : listaConsultas ) {
             System.out.println(consultas.toString());
        }

    }
}
