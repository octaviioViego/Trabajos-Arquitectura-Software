package com.arquitectura.consultorio.model;
public class TrabajadorAdministrativo {
    private String numEmpleado;
    private Persona persona;

    public TrabajadorAdministrativo(String numEmpleado, Persona persona) {
        this.numEmpleado = numEmpleado;
        this.persona = persona;
    }

    public String getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(String numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
}
