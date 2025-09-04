package com.asimov.smarthome.seguridad;

public class CamaraVigilancia extends Seguridad {

    @Override
    public void encender() {
       System.out.println("Camaras de vigilancia encendidas.");
       System.out.println("Grabando..");
    }

    @Override
    public void apagar() {  
       System.out.println("Deteniendo grabación..");
       System.out.println("Camaras de vigilancia apagadas.");
    }
    
}
