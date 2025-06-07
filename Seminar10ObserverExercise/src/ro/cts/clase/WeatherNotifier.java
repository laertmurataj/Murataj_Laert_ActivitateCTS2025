package ro.cts.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class WeatherNotifier implements Subject{

    private List<Observer> users;

    public WeatherNotifier() {
        this.users = new ArrayList<Observer>();
    }

    @Override
    public void addObserver(Observer observer) {
         this.users.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        this.users.remove(observer);

    }

    @Override
    public void notifyObserver(String message) {
        for(Observer user:users){
            user.recieveAlert(message);
        }

    }
}
