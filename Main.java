
public class Main {
    public static void main(String[] arg) {
        ObjetoUnico archivoLogs = ObjetoUnico.obtenerInstacia();

        FabricaSensor fabricaPremium;
        fabricaPremium = new FabricaPremium();

        AlarmaMovimiento alarma = new AlarmaMovimiento();
        Aspersor aspersor = new Aspersor();

        SensorHumo sensorHumo = fabricaPremium.crearSensorHumo();
        SensorMovimiento sensorMovimiento = fabricaPremium.crearSensorMovimiento();

        SensorSistema sistema = new SensorSistema();
        sistema.registrar((AlertaSensor) sensorHumo);
        sistema.registrar((AlertaSensor) sensorMovimiento);
        sistema.notificarUsuario();

        ControlSeguridad control = new ControlSeguridad();
        control.setComando(new ApagarAlarma(alarma));
        control.bottonPresionado();

        control.setComando(new ApagarAspersor(aspersor));
        control.bottonPresionado();
    }
}