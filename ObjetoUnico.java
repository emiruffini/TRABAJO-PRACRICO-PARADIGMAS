
public class ObjetoUnico {

    // Crear una instancia de un objeto único
    private static ObjetoUnico instancia = new ObjetoUnico();

    //// Al hacer el constructor privado, esta clase no podrá ser instanciada
    private ObjetoUnico() {
    }

    // Obtener el unico objeto disponible
    public static ObjetoUnico obtenerInstacia() {
        return instancia;
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje + " detectado");
    }
}