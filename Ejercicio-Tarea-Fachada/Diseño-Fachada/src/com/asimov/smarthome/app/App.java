package com.asimov.smarthome.app;

import com.asimov.smarthome.control.ControlSeguridad;

public class App {
    public static void main(String[] args) throws Exception {
        ControlSeguridad controlSeguridad = new ControlSeguridad();

        controlSeguridad.sistemaSeguridadActivado();
    }
}
