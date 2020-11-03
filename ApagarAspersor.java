
public class ApagarAspersor implements Comando {
    Aspersor aspersor;

    public ApagarAspersor(Aspersor aspersor) {
        super();
        this.aspersor = aspersor;
    }

    public void ejecutar() {
        System.out.println("Apagando aspersor...");
        aspersor.apagar();
    }
}
