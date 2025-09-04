package com.asimov.smarthome.seguridad;

public class Cerradura extends Seguridad {

    @Override
    public void encender() {
        System.out.println("Cerraduras activadas..");
        System.out.println("Cerraduras bloqueadas.");
    }

    @Override
    public void apagar() {
        System.out.println("Cerraduras desactivadas..");
        System.out.println("Cerraduras abiertas.");
    }
    
}
