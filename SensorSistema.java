
import java.util.Enumeration;
import java.util.Vector;

class SensorSistema {
    public Vector<AlertaSensor> listeners = new Vector();

    public void registrar(AlertaSensor alertaSensor) {
        listeners.addElement(alertaSensor);
    }

    public void notificarUsuario() {
        for (Enumeration<AlertaSensor> e = listeners.elements(); e.hasMoreElements();) {
            ((AlertaSensor) e.nextElement()).detectar();
        }
    }
}
