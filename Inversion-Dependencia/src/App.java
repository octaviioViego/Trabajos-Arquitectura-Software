import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
       Usuario u1 = new Usuario("Octavio", "Arroyo",  new PayPal("octavio.arroyo@paypal.com"));
       Usuario u2 = new Usuario("Brian", "Maldonado", new AmericanExpress("123-456-789","105312"));
       Usuario u3 = new Usuario("Jose", "Quiroz", new Mastercard("321-654-987","10/01/27","QJ23xwQ"));

       //Los tres aplicaron suscripcion
       u1.creaSuscripcion();
       u2.creaSuscripcion();
       u3.creaSuscripcion();

       //Uno cancelo la suscripción
       u3.cancelarSuscripcion();
       
       //Guardamos los usuarios en un array
       ArrayList<Usuario> usuarios = new ArrayList<>();
       usuarios.add(u1);
       usuarios.add(u2);
       usuarios.add(u3);

       System.out.println();
       System.out.println("Iniciamos los cobros por mensualidad.");
       //Cobranos la mesualidad de manera automatica a los usuarios que esten activos
       for (Usuario usuario : usuarios) {
            if(usuario.isSuscripcionActiva()){
                System.out.println();
                System.out.println("Nombre: " + usuario.getNombre());
                System.out.println("Apellido: " + usuario.getApellidoPaterno());
                System.out.println("Procesando......");
                usuario.getSuscripcion().cobrarMensualidad();
                System.out.println();
            }
       }


    }
}
