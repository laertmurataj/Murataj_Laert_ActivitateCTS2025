package ro.cts.clase;

public class RezervareBuilder implements AbstractBuilder{
    private Rezervare rezervare;

    public RezervareBuilder(String numeClient){
        rezervare = new Rezervare(numeClient, false, false, false, "Necunoscut");
    }

    public RezervareBuilder setHasScauneErgom(boolean val){
        rezervare.setHasScauneErgom(val);
        return this;
    }

    public RezervareBuilder setHasAsezareGeam(boolean val){
        rezervare.setHasAsezareGeam(val);
        return this;
    }

    public RezervareBuilder setHasDecorareMasa(boolean val){
        rezervare.setHasDecorareMasa(val);
        return this;
    }

    public RezervareBuilder setGenMuzica(String val){
        rezervare.setGenMuzica(val);
        return this;
    }

    @Override
    public Rezervare build() {
        return rezervare;
    }
}
