public class SmartLight {
    private String name;

    public SmartLight(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public SmartLight setName(String name) {
        this.name = name;
        return this;
    }

    public void activate() {
        System.out.println("Activation" + this.getName());

    }
}
