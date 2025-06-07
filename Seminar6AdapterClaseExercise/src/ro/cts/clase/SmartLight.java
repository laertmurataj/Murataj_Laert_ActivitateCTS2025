package ro.cts.clase;

public class SmartLight implements ISmartLight{
    private String name;

    public SmartLight(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void activate() {
        System.out.println("Activation: "+this.name);

    }
}
