package ro.cts.main;


import ro.cts.clase.Adapter;
import ro.cts.clase.SmartDevice;
import ro.cts.clase.SmartLight;

public class Main {
    public static void main(String[] args) {
        SmartDevice smartDevice = new SmartDevice("TV");
        smartDevice.turnOn();
        SmartLight smartLight = new SmartLight("OldLight");
        Adapter adapter = new Adapter("OldLight");
        adapter.activate();
        }
    }
