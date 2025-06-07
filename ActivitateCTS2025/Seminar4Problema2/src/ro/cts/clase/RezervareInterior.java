package ro.cts.clase;

public class RezervareInterior extends AbstractRezervare {
    private boolean esteLaParter;

    public RezervareInterior(float nrParticipanti, int ora, String numeClient, int ziuaLunii, boolean esteLaParter) {
        super(nrParticipanti, ora, numeClient, ziuaLunii);
        this.esteLaParter = esteLaParter;
    }

    public RezervareInterior(){
        super();
    }

    @Override
    public AbstractRezervare copiaza(int ziua) {
        RezervareInterior rezervare = new RezervareInterior();

        rezervare.ziuaLunii = ziua;
        rezervare.numeClient = this.numeClient;
        rezervare.ora = this.ora;
        rezervare.nrParticipanti = this.nrParticipanti;
        rezervare.esteLaParter = this.esteLaParter;

        return rezervare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RezervareInterior{");
        sb.append("esteLaParter=").append(esteLaParter);
        sb.append(", nrParticipanti=").append(nrParticipanti);
        sb.append(", ora=").append(ora);
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append(", ziuaLunii=").append(ziuaLunii);
        sb.append('}');
        return sb.toString();
    }
}
