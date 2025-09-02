package Juego;
import Grafico.MotorGraficos;
import Sonido.MotorSonido;

public class JuegoFachada {
    private MotorGraficos graficos;
    private MotorSonido sonido;

    public JuegoFachada(){
        graficos = new MotorGraficos();
        sonido = new MotorSonido();
    }

    public void iniciarJuego(){
        graficos.dibujar();
        sonido.reproducirSonido();
         System.out.println("Juego iniciado");
    }
}
