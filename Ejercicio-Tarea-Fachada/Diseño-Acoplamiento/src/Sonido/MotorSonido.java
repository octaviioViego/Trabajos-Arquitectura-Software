package Sonido;

public class MotorSonido extends ControladorSonido{
     public void reproducirSonido(){
        iniciar();
        setSonido();
        System.out.println("Reproduciendo sonido..");
    }    
}
