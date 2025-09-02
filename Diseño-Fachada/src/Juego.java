public class Juego {
    private JuegoFachada fachada;
    public Juego(){
        fachada = new JuegoFachada();
    }

    public void iniciar(){
        fachada.iniciarJuego();
    }
}

