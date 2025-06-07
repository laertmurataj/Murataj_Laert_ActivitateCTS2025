package ro.cts.clase;

public class MedicamentFarmacie implements iMedicamentFarmacie{
    private String numeMedicament;
    private String dataExpirare;
    private boolean isInStock;
    private float pret;

    public MedicamentFarmacie(String numeMedicament, String dataExpirare, boolean isInStock, float pret) {
        this.numeMedicament = numeMedicament;
        this.dataExpirare = dataExpirare;
        this.isInStock = isInStock;
        this.pret = pret;
    }

    public void cumparaMedicament(){
        System.out.println("Medicamentul care expira in data de " + this.dataExpirare + " are numele " + this.numeMedicament + " si are pretul de " + this.pret + ". Acum este in stock?: " + this.isInStock);
    }
}
