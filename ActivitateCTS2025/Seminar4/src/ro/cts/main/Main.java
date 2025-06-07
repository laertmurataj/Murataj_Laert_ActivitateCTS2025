package ro.cts.main;

import ro.cts.clase.FabricaSupe.FabricaSupe;
import ro.cts.clase.FabricaSupe.TipSupa;
import ro.cts.clase.Supa;
import ro.cts.clase.SupaLegume;

public class Main {
    public static void main(String[] args) {
        // punct 1 pdf Restaurant
        FabricaSupe fabricaSupe = new FabricaSupe(15.99f, 152.2f);
        Supa supaLegume = fabricaSupe.getSupe(TipSupa.LEGUME, 300);
        Supa supaVita = fabricaSupe.getSupe(TipSupa.VITA, 350);
        Supa supaCocos = fabricaSupe.getSupe(TipSupa.COCOCS, 380);

        supaLegume.afiseazaDescriere();
        supaVita.afiseazaDescriere();
        supaCocos.afiseazaDescriere();
    }
}