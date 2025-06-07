package ro.cts.clase;

public class Passenger {
    private String name;
    private boolean hasPassport;
    private boolean hasBoardingPass;
    private float luggageWeight;

    public Passenger(String name, boolean hasPassport, boolean hasBoardingPass, float luggageWeight) {
        this.name = name;
        this.hasPassport = hasPassport;
        this.hasBoardingPass = hasBoardingPass;
        this.luggageWeight = luggageWeight;
    }

    public String getName() {
        return name;
    }

    public boolean isHasPassport() {
        return hasPassport;
    }

    public boolean isHasBoardingPass() {
        return hasBoardingPass;
    }

    public float getLuggageWeight() {
        return luggageWeight;
    }
}
