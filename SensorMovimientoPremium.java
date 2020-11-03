
public class SensorMovimientoPremium implements SensorMovimiento, AlertaSensor {

    static final String DESCRIPCION = "Detector de Movimiento hecho por la fábrica premium";

    @Override
    public String obtenerDescripcion() {
        return DESCRIPCION;
    }

    public void detectar() {
        Mensaje mensaje = new AdaptadorMensajeMovimiento(new MensajeMovimiento());

        System.out.println("Detector de Movimiento - hecho por fábrica Premium");
        mensaje.enviarMensaje("Movimiento detectado");

        AlarmaMovimiento alarma = new AlarmaMovimiento();
        EncenderAlarma encender = new EncenderAlarma(alarma);
        encender.ejecutar();

        ObjetoUnico archivoLogs = ObjetoUnico.obtenerInstacia();
        archivoLogs.mostrarMensaje("archivoLogs: Movimiento");

    }
}
