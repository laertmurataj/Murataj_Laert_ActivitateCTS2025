package ro.cts.clase;

public class SmartDevice {
    private String name;

    public SmartDevice(String name) {
        this.name = name;
    }
    public void turnOn(){
        System.out.println("Turning on: "+this.name);
    }
}
