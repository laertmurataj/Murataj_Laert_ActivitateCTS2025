package ro.cts.main;

import ro.cts.clase.AdaptorObiecteMedicament;
import ro.cts.clase.MedicamentFarmacie;
import ro.cts.clase.MedicamentSpital;

// problema 5 din pdf Spital -> adaptor de obiecte
public class Main {
    public static void vindeMedicament(MedicamentFarmacie medicamentFarmacie){
        System.out.println("Bine ati venit la Farmacia Dr.Max");
        medicamentFarmacie.cumparaMedicament();
    }
    public static void main(String[] args) {
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("Paracetamol", "25.01.2026", true, 21.99f);
        vindeMedicament(medicamentFarmacie);
        System.out.println("----------");
        MedicamentSpital medicamentSpital = new MedicamentSpital("Ibuprofen", 35.99f);
        AdaptorObiecteMedicament adapter = new AdaptorObiecteMedicament(medicamentSpital);
        vindeMedicament(adapter);


    }
}