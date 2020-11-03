
public class AdaptadorMensajeHumo implements Mensaje {
    private MensajeHumo adaptador;

    public AdaptadorMensajeHumo(MensajeHumo mensajeHumo) {
        this.adaptador = mensajeHumo;
    }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Mensaje desde el adaptador de Humo: " + mensaje);
        // Aqui el mensaje puede ser modificado
    }
}
