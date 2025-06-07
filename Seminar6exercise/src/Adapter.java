public class Adapter extends SmartDevice{
    private SmartLight smartLight;

    public Adapter(SmartLight smartLight) {
        super(smartLight.getName());
        this.smartLight=smartLight;
    }


    @Override
    public void turnOn() {
        smartLight.activate();
    }
}
