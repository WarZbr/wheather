package push;

import java.util.ArrayList;
import java.util.List;

class WeatherStation implements PushSubject {
    private final List<PushObserver> observers = new ArrayList<>();
    private int temperature;
    private int humidity;


    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        notifyObservers();
    }

    @Override
    public void registerObserver(PushObserver observer) {
        observers.add(observer);
    }


    @Override
    public void removeObserver(PushObserver observer) {
        observers.remove(observer);
    }


    @Override
    public void notifyObservers() {
        for (PushObserver observer : observers) {
            observer.update(temperature, humidity);
        }
    }
}
