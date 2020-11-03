
public class ApagarAlarma implements Comando {
    AlarmaMovimiento alarma;

    public ApagarAlarma(AlarmaMovimiento alarma) {
        super();
        this.alarma = alarma;
    }

    public void ejecutar() {
        System.out.println("Apagando alarma...");
        alarma.apagar();
    }
}
