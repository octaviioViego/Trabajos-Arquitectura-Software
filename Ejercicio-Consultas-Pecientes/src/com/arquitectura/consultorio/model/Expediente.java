package com.arquitectura.consultorio.model;

import java.util.ArrayList;
import java.util.UUID;

import com.arquitectura.consultorio.interfaces.IPaciente;

public class Expediente {
    private UUID idExpediente;
    private String idPersona;
    private ArrayList<Consulta> consultas;
    
    public Expediente(IPaciente paciente) {
        this.idExpediente = UUID.randomUUID();
        this.idPersona = paciente.getIndentificador();
        this.consultas = new ArrayList<>();
    }

    //Creamos un método agregar consulta
    public void agregarConsulta(Consulta consulta){
        consultas.add(consulta);    
    }

    public UUID getIdExpediente() {
        return idExpediente;
    }
    public void setIdExpediente(UUID idExpediente) {
        this.idExpediente = idExpediente;
    }
    public String getIdPersona() {
        return idPersona;
    }
    public void setIdPersona(String persona) {
        this.idPersona = persona;
    }
    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }
    public void setConsultas(ArrayList<Consulta> consultas) {
        this.consultas = consultas;
    }

}
