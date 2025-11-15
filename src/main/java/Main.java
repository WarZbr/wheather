public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        PhoneDisplay phoneDisplay = new PhoneDisplay();
        TVDisplay tvDisplay = new TVDisplay();


        weatherStation.registerObserver(phoneDisplay);
        weatherStation.registerObserver(tvDisplay);


        weatherStation.setTemperature(20);
        weatherStation.setTemperature(68);


        weatherStation.removeObserver(tvDisplay);


        weatherStation.setTemperature(25);
    }
}