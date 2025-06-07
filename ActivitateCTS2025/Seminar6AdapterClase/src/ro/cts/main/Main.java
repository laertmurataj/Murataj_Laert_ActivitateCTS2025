package ro.cts.main;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        Farmacie farmacie = new Farmacie("Catena");
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("ParacetamolForte", "25.02.2026", true, 39.99f);
        MedicamentFarmacie medicamentFarmacie2 = new MedicamentFarmacie("Parasinus", "25.02.2026", true, 36.99f);

        farmacie.vindeMedicament(medicamentFarmacie);
        farmacie.vindeMedicament(medicamentFarmacie2);

        MedicamentSpital medicamentSpital = new MedicamentSpital("Algocalmin", 31.99f);
        AdaptorClaseMedicament adaptorClaseMedicament = new AdaptorClaseMedicament("Algocalmin", 31.99f);
        farmacie.vindeMedicament(adaptorClaseMedicament);

    }
}