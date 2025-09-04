package com.asimov.smarthome.control;

import com.asimov.smarthome.iluminacion.Exterior;
import com.asimov.smarthome.iluminacion.Interior;
import com.asimov.smarthome.notificacion.NotificacionBomberos;
import com.asimov.smarthome.notificacion.NotificacionPolicial;
import com.asimov.smarthome.notificacion.NotificacionServiciosMedicos;
import com.asimov.smarthome.seguridad.SirenaExterior;
import com.asimov.smarthome.seguridad.CamaraVigilancia;
import com.asimov.smarthome.seguridad.Cerradura;
import com.asimov.smarthome.seguridad.SensorHumo;
import com.asimov.smarthome.seguridad.SensorMovimiento;

public class ControlSeguridad implements IControlSeguridad {
    SensorHumo sensorHumo;
    Cerradura cerraduras;
    CamaraVigilancia camarasVigilancia;
    SirenaExterior sirenaExterior;
    SensorMovimiento sensorMovimiento;
    Exterior iluminacionExterior;
    Interior iluminacionInterior;
    NotificacionBomberos notificacionBomberos;
    NotificacionPolicial notificacionPolicial;
    NotificacionServiciosMedicos notificacionServiciosMedicos;
    

    public ControlSeguridad(){
        this.sensorHumo = new SensorHumo();
        this.cerraduras = new Cerradura();
        this.camarasVigilancia = new CamaraVigilancia();
        this.sirenaExterior = new SirenaExterior();
        this.sensorMovimiento = new SensorMovimiento();
        this.iluminacionExterior = new Exterior();
        this.iluminacionInterior = new Interior();
        this.notificacionBomberos = new NotificacionBomberos();
        this.notificacionPolicial = new NotificacionPolicial();
        notificacionServiciosMedicos = new NotificacionServiciosMedicos();
    }
    
    @Override
    public void alertaIntrusoActivado() {
        System.out.println("Alerta de intruso activado.");
        sirenaExterior.encender();
        iluminacionExterior.encender();
        notificacionPolicial.notificacion();
    }

    @Override
    public void alertaIntrusoDesactivado() {
        System.out.println("Desactivando alerta de intruso.");
        sirenaExterior.apagar();
        iluminacionExterior.apagar();
        System.out.println("Alerta de intruso desactivado.");
    }
    
    @Override
    public void modoNocheActivado() {
        System.out.println("Activando modo noche.");
        camarasVigilancia.encender();
        sensorMovimiento.encender();
        iluminacionInterior.apagar();
        cerraduras.encender();
        System.out.println("Modo noche activado.");
    }

    @Override
    public void modoNocheDesacivado() {
        System.out.println("Desactivando modo noche.");
        camarasVigilancia.apagar();
        sensorMovimiento.apagar();
        cerraduras.apagar();
        System.out.println("Modo noche desactivado.");
    }

    @Override
    public void modoEmergenciaIncendioActivado() {
       System.out.println("Sistema de incendio activado.");
       sirenaExterior.encender();
       cerraduras.apagar();
       iluminacionExterior.encender();
       iluminacionInterior.encender();
       notificacionBomberos.notificacion();
       notificacionPolicial.notificacion();
       notificacionServiciosMedicos.notificacion();
    }

    @Override
    public void modoEmergenciaIncendioDesactivado() {
       System.out.println("Desactivando sistema de incendio");
       sirenaExterior.apagar();
       System.out.println("Sistema de incendio desactivado.");
    }

    @Override
    public void sistemaSeguridadActivado() {
       System.out.println("Activando sistema de seguridad.");
       camarasVigilancia.encender();
       sensorHumo.encender();
       System.out.println("Sistema de seguridad activado.");
    }

    @Override
    public void sistemaSeguridadDesactivado() {
       System.out.println("Desactivando sistemas de seguridad.");
       camarasVigilancia.apagar();
       sensorHumo.apagar();
       System.out.println("Sistemas de seguridad desactivado.");
    }
    
}
