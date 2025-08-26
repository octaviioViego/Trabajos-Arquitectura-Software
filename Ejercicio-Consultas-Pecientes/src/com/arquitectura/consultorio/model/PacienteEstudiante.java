package com.arquitectura.consultorio.model;
import com.arquitectura.consultorio.interfaces.IPaciente;

public class PacienteEstudiante implements IPaciente{
    private String matricula;

    public PacienteEstudiante(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String getIndentificador() {
        return matricula;
    }

    
    
        
}
