
public class ControlSeguridad {
    Comando comando;

    public void setComando(Comando comando) {
        this.comando = comando;
    }

    public void bottonPresionado() {
        comando.ejecutar();
    }

}
