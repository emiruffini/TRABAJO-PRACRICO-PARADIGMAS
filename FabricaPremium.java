
public class FabricaPremium implements FabricaSensor {
    @Override
    public SensorMovimiento crearSensorMovimiento() {
        return new SensorMovimientoPremium();
    }

    @Override
    public SensorHumo crearSensorHumo() {
        return new SensorHumoPremium();
    }
}
