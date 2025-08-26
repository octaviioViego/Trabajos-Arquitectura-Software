package com.arquitectura.consultorio.model;

import java.util.UUID;
import java.util.Date; 

public class Consulta {
    private UUID idConsulta;
    private String peso;
    private double altura;
    private String sintomas;
    private String diagnostico;
    private String tratamiento;
    private Date  fechaConsultorio;
    private UUID idMedico;

    public Consulta(String peso, double altura, String sintomas, String diagnostico,
            String tratamiento, UUID idMedico) {
        this.idConsulta = UUID.randomUUID();
        this.fechaConsultorio = new Date();
        this.peso = peso;
        this.altura = altura;
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.idMedico = idMedico;
    }

    public UUID getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(UUID idConsultorio) {
        this.idConsulta = idConsultorio;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public Date getFechaConsultorio() {
        return fechaConsultorio;
    }

    public void setFechaConsultorio(Date fechaConsultorio) {
        this.fechaConsultorio = fechaConsultorio;
    }

    public UUID getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(UUID idMedico) {
        this.idMedico = idMedico;
    }
    
    @Override
    public String toString(){
        return  "\nDatos de la consulta....."+
                "\nFecha de la consulta: " + this.fechaConsultorio + 
                "\nPeso: " + this.peso + 
                "\nAltura: " + this.altura +
                "\nSintomas: " + this.sintomas +
                "\nDiagnostico: " + this.diagnostico + 
                "\nTratamiento: " + this.tratamiento + 
                "\nIdentifiocador del medico: " + this.idMedico;
    }

}
