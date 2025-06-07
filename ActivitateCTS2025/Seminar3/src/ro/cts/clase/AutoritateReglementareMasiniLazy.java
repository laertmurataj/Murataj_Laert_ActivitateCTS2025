package ro.cts.clase;
// singleton de tip lazy
public class AutoritateReglementareMasiniLazy {
    private String nume;
    private String website;
    private int nrReglementari;
    private static AutoritateReglementareMasiniLazy instance = null;


    private AutoritateReglementareMasiniLazy(String nume, String website, int nrReglementari) {
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

    public static synchronized AutoritateReglementareMasiniLazy getInstance(String nume, String website) {
        if(instance == null)
        {
            instance = new AutoritateReglementareMasiniLazy(nume, website, 0);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "AutoritateReglementareMasiniLazy{" +
                "nume='" + nume + '\'' +
                ", website='" + website + '\'' +
                ", nrReglementari=" + nrReglementari +
                '}';
    }
}
