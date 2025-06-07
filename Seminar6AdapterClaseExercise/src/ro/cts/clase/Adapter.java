package ro.cts.clase;

public class Adapter extends SmartDevice implements ISmartLight{
    public Adapter(String name) {
        super(name);
    }

    @Override
    public void activate() {
        super.turnOn();
    }
}
