package com.asimov.smarthome.seguridad;

public class SirenaExterior extends Seguridad {

    @Override
    public void encender() {
        System.out.println("Alerta sonora encendida..");
        System.out.println("Sonando..");
    }

    @Override
    public void apagar() {
        System.out.println("Alerta sonora apagada..");
    }
    
}
