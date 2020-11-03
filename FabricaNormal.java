
public class FabricaNormal implements FabricaSensor {
    @Override
    public SensorMovimiento crearSensorMovimiento() {
        return new SensorMovimientoComun();
    }

    @Override
    public SensorHumo crearSensorHumo() {
        return new SensorHumoComun();
    }
}
