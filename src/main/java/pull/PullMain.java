package pull;

public class PullMain {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        PhoneDisplay phoneDisplay = new PhoneDisplay(weatherStation);
        TVDisplay tvDisplay = new TVDisplay(weatherStation);
        PullObserver thermostatDisplay = new ThermostatDisplay(weatherStation);

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