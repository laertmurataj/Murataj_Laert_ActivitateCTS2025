package ro.cts.clase;

public class Client  {
    private String nume;
    private double suma;

    public Client(String nume, double suma) {
        this.nume = nume;
        this.suma = suma;
    }

    public String getNume() {
        return nume;
    }

    public double getSuma() {
        return suma;
    }
}
