package ro.cts.clase;
// singleton de tip eager, verifica singleton diagram
public class AutoritateReglementareMasiniEager {
    private String nume;
    private String website;
    private int nrReglementari;
    private static AutoritateReglementareMasiniEager instance = new AutoritateReglementareMasiniEager("AutoritateAuto", "www.autoritate.ro", 200);


    private AutoritateReglementareMasiniEager(String nume, String website, int nrReglementari) {
        this.nume = nume;
        this.website = website;
        this.nrReglementari = nrReglementari;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void reglementeazaModel(String nume){
        nrReglementari++;
    }

    public static AutoritateReglementareMasiniEager getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "AutoritateReglementareMasiniEager{" +
                "nume='" + nume + '\'' +
                ", website='" + website + '\'' +
                ", nrReglementari=" + nrReglementari +
                '}';
    }
}
