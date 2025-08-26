package com.arquitectura.consultorio.model;
import java.util.UUID;

public class Medico {
    private UUID idMedico;
    private String numEmpleado;
    private String numCelula;
    private Persona persona;

    public Medico(String numEmpleado, String numCelula, Persona persona) {
        this.idMedico = UUID.randomUUID();
        this.numEmpleado = numEmpleado;
        this.numCelula = numCelula;
        this.persona = persona;
    }

    public UUID getIdMedico() {
        return idMedico;
    }
    
    public String getNumEmpleado() {
        return numEmpleado;
    }
    
    public void setNumEmpleado(String numEmpleado) {
        this.numEmpleado = numEmpleado;
    }
    
    public String getNumCelula() {
        return numCelula;
    }
    public void setNumCelula(String numCelula) {
        this.numCelula = numCelula;
    }
    
    @Override
    public String toString(){
        return  "\nDatos del medico....." +
                "\nNúmero de empleado: " + this.numEmpleado +
                "\nNúmero de celula: " + this.numCelula +
                "\nNombre: " + persona.getNombre() + 
                "\nApellido paterno: " + persona.getApellidoP() + 
                "\nApellido materno: " + persona.getApellidoM() + 
                "\nTelefono: " + persona.getTelefono() + "\n";
    }
}
