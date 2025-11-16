package push;

public class ThermostatDisplay implements PushObserver {
    private int temperature;

    @Override
    public void update(int temperature, int humidity) {
        setTemperature(temperature);
        System.out.println("[THERMOSTAT] Temperatura atual: " + temperature + "°C");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

}
