package Juego;
import Grafico.MotorGrafico;
import Sonido.MotorSonido;


public class juego extends MotorGrafico{
    
    private MotorSonido sonido;

    public void iniciarJuego(){

        sonido = new MotorSonido();
        dibujar();
        sonido.reproducirSonido();
        System.out.println("Juego iniciado");
        
    }
}
