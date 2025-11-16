package pull;

class PhoneDisplay implements PullObserver {
    private final WeatherStation weatherStation;
    private int temperature;
    private int humidity;

    PhoneDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        setHumidity(weatherStation.getHumidity());
        setTemperature(weatherStation.getTemperature());
        System.out.println("[PHONE] Temperatura atual: " + temperature + "°C, Umidade do ar: " + humidity + "%");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
}
