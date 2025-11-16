package push;

public class PushMain {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        PhoneDisplay phoneDisplay = new PhoneDisplay();
        TVDisplay tvDisplay = new TVDisplay();
        PushObserver thermostatDisplay = new ThermostatDisplay();

        weatherStation.registerObserver(phoneDisplay);
        weatherStation.registerObserver(tvDisplay);
        weatherStation.registerObserver(thermostatDisplay);

        weatherStation.setTemperature(20);
        weatherStation.setTemperature(68);
        weatherStation.setHumidity(40);

        weatherStation.removeObserver(tvDisplay);

        weatherStation.setHumidity(60);
        weatherStation.setTemperature(25);
    }
}