package ro.cts.clase;

public class AdaptorObiecteMedicament extends MedicamentFarmacie{
    MedicamentSpital medicamentSpital;

    public AdaptorObiecteMedicament(MedicamentSpital medicamentSpital){
        super(medicamentSpital.getNumeMedicament(), "25.12.2025", true, medicamentSpital.getPret());
        this.medicamentSpital = medicamentSpital;
    }

//    public AdaptorObiecteMedicament(String numeMedicament, String dataExpirare, boolean isInStock, float pret) {
//        super(numeMedicament, dataExpirare, isInStock, pret);
//    }


    @Override
    public void cumparaMedicament(){
        medicamentSpital.achizitioneazaMedicament();
    }
}
