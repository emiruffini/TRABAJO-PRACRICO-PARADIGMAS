
public class EncenderAlarma implements Comando {
    AlarmaMovimiento alarma;

    public EncenderAlarma(AlarmaMovimiento alarma) {
        super();
        this.alarma = alarma;
    }

    public void ejecutar() {
        System.out.println("Encendiendo alarma...");
        alarma.encender();
    }
}
