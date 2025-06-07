public class SmartDevice {
    private String name;

    public SmartDevice(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public SmartDevice setName(String name) {
        this.name = name;
        return this;
    }

    public void turnOn(){
        System.out.println("Turning on"+ this.getName());

    }
}
