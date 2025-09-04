package com.asimov.smarthome.seguridad;

public class SensorHumo extends Seguridad {

    @Override
    public void encender() {
       System.out.println("Sensor de humo activado.");
    }

    @Override
    public void apagar() {
        System.out.println("Sensor de humo desactivado.");
    }
    
}
