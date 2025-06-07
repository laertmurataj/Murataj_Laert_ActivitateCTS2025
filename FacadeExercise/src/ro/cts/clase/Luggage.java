package ro.cts.clase;

public class Luggage {
    public boolean weightAllowed(Passenger passenger){
        return passenger.getLuggageWeight()<20;
    }
}
