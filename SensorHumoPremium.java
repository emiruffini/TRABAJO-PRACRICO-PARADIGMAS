
public class SensorHumoPremium implements SensorHumo, AlertaSensor {

    static final String DESCRIPCION = "Detector de Humo hecho por la fábrica premium";

    @Override
    public String obtenerDescripcion() {
        return DESCRIPCION;
    }

    public void detectar() {
        Mensaje mensaje = new AdaptadorMensajeHumo(new MensajeHumo());

        System.out.println("Detector de Humo - hecho por fábrica premium");
        mensaje.enviarMensaje("Humo detectado");

        Aspersor aspersor = new Aspersor();
        EncenderAspersor encender = new EncenderAspersor(aspersor);
        encender.ejecutar();

        ObjetoUnico archivoLogs = ObjetoUnico.obtenerInstacia();
        archivoLogs.mostrarMensaje("archivoLogs: Humo");

    }
}