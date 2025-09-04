package com.asimov.smarthome.seguridad;

public class SensorMovimiento extends Seguridad {

    @Override
    public void encender() {
        System.out.println("Sesor de movimiento activado..");
    }

    @Override
    public void apagar() {
        System.out.println("Sesor de movimiento desactivado..");
    }
    
}
