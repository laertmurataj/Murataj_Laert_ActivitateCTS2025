package ro.cts.clase;

public class RezervareBuilder implements  AbstractBuilder{
    private String numeClient;
    private boolean hasAsezareGeam;
    private boolean hasScauneErgom;
    private boolean hasDecorareMasa;
    private String genMuzica;

    public RezervareBuilder(){
        hasAsezareGeam = false;
        hasScauneErgom = false;
        hasDecorareMasa = false;
        genMuzica = "Fara muzica";
    }

    public RezervareBuilder setNumeClient(String numeClient) {
        this.numeClient = numeClient;
        return this;
    }

    public RezervareBuilder setHasAsezareGeam(boolean hasAsezareGeam) {
        this.hasAsezareGeam = hasAsezareGeam;
        return this;
    }

    public RezervareBuilder setHasScauneErgom(boolean hasScauneErgom) {
        this.hasScauneErgom = hasScauneErgom;
        return this;
    }

    public RezervareBuilder setHasDecorareMasa(boolean hasDecorareMasa) {
        this.hasDecorareMasa = hasDecorareMasa;
        return this;
    }

    public RezervareBuilder setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }

    @Override
    public Rezervare build(String numeClient) {
        return new Rezervare(numeClient, hasAsezareGeam, hasScauneErgom, hasDecorareMasa, genMuzica);
    }
}
