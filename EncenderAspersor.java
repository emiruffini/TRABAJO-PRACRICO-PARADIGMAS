
public class EncenderAspersor implements Comando {
    Aspersor aspersor;

    public EncenderAspersor(Aspersor aspersor) {
        super();
        this.aspersor = aspersor;
    }

    public void ejecutar() {
        System.out.println("Encendiendo aspersor...");
        aspersor.encender();
    }
}
