package com.asimov.smarthome.control;

public interface IControlSeguridad {
    public void alertaIntrusoActivado();
    public void alertaIntrusoDesactivado();
    public void modoNocheActivado();
    public void modoNocheDesacivado();
    public void modoEmergenciaIncendioActivado();
    public void modoEmergenciaIncendioDesactivado();
    public void sistemaSeguridadActivado();
    public void sistemaSeguridadDesactivado();
}

