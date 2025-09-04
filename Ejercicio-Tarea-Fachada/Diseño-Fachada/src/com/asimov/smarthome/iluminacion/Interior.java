package com.asimov.smarthome.iluminacion;

public class Interior extends Iluminacion {

    @Override
    public void encender() {
        System.out.println("Iluminacion interior encendida..");
    }

    @Override
    public void apagar() {
        System.out.println("Iluminación interior apagada..");
    }
    
}
