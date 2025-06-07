package ro.cts.main;

import ro.cts.clase.Observer;
import ro.cts.clase.User;
import ro.cts.clase.WeatherNotifier;
import ro.cts.clase.WeatherStation;

import java.io.ObjectOutputStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Observer user1 = new User("Andrei");
        WeatherNotifier weather = new WeatherStation("Bucharest");
        weather.addObserver(user1);
        ((WeatherStation)weather).sendHeatWaveAlert();
        Observer user2 = new User("Laert");
        WeatherNotifier weather1 = new WeatherStation("Cluj");
        weather1.addObserver(user2);
        ((WeatherStation)weather1).sendStormAlert();
        weather1.notifyObserver("Run!!!!");
        }
    }
