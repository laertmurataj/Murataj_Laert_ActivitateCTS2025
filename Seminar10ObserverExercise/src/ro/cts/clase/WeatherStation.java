package ro.cts.clase;

public class WeatherStation extends WeatherNotifier{
    private String location;

    public WeatherStation(String location) {
        this.location = location;
    }

    public void sendStormAlert(){
        notifyObserver("Storm is coming at this location: "+location);
    };
    public void sendHeatWaveAlert(){
        notifyObserver("Heat wave is coming at this location: "+location);

    }
}
