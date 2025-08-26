package com.arquitectura.consultorio.model;
import com.arquitectura.consultorio.interfaces.IPaciente;

public class PacienteTrabajador implements IPaciente {
    private String numTrabajador;
    
    public PacienteTrabajador(String numTrabajador) {
        this.numTrabajador = numTrabajador;
    }


    @Override
    public String getIndentificador() {
        return numTrabajador;
    }
        
}
