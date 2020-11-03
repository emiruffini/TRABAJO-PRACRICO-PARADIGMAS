
public class AdaptadorMensajeMovimiento implements Mensaje {
    private MensajeMovimiento adaptador;

    public AdaptadorMensajeMovimiento(MensajeMovimiento mensajeMovimiento) {
        this.adaptador = mensajeMovimiento;
    }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Mensaje adaptador de movimiento: " + mensaje);
        // Aqui el mensaje puede ser modificado
    }
}
