package ro.cts.clase;

public class Farmacie {
    private String nume;

    public Farmacie(String nume) {
        this.nume = nume;
    }

    public void vindeMedicament(iMedicamentFarmacie medicamentFarmacie){
        System.out.println("La farmacia " + this.nume);
        medicamentFarmacie.cumparaMedicament();
    }
}
