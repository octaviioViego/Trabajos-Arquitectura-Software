package com.asimov.smarthome.iluminacion;

public class Exterior extends Iluminacion{

    @Override
    public void encender() {
        System.out.println("Iluminación exterior encendida..");
        System.out.println("Exterior iluminado..");
    }

    @Override
    public void apagar() {
        System.out.println("Iluminación exterior apagada..");
    }
    
}
