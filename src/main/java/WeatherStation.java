import java.util.ArrayList;
import java.util.List;

class WeatherStation implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private int temperature;


    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }


    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }


    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}
