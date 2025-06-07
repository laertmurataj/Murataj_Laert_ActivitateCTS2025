package ro.cts.clase;
// pdf Restaurant problema 2 - builder varianta 2
public class Rezervare {
    private String numeClient;
    private boolean hasAsezareGeam;
    private boolean hasScauneErgom;
    private boolean hasDecorareMasa;
    private String genMuzica;

    protected Rezervare(String numeClient, boolean hasAsezareGeam, boolean hasScauneErgom, boolean hasDecorareMasa, String genMuzica) {
        this.numeClient = numeClient;
        this.hasAsezareGeam = hasAsezareGeam;
        this.hasScauneErgom = hasScauneErgom;
        this.hasDecorareMasa = hasDecorareMasa;
        this.genMuzica = genMuzica;
    }

    protected void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    protected void setHasAsezareGeam(boolean hasAsezareGeam) {
        this.hasAsezareGeam = hasAsezareGeam;
    }

    protected void setHasScauneErgom(boolean hasScauneErgom) {
        this.hasScauneErgom = hasScauneErgom;
    }

    protected void setHasDecorareMasa(boolean hasDecorareMasa) {
        this.hasDecorareMasa = hasDecorareMasa;
    }

    protected void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", hasAsezareGeam=").append(hasAsezareGeam);
        sb.append(", hasScauneErgom=").append(hasScauneErgom);
        sb.append(", hasDecorareMasa=").append(hasDecorareMasa);
        sb.append(", genMuzica='").append(genMuzica).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
