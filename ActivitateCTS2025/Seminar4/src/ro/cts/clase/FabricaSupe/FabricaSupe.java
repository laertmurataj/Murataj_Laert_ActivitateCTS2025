package ro.cts.clase.FabricaSupe;

import ro.cts.clase.Supa;
import ro.cts.clase.SupaCocos;
import ro.cts.clase.SupaLegume;
import ro.cts.clase.SupaVita;

public class FabricaSupe {
    private float pret;
    private float calorii;

    public FabricaSupe(float pret, float calorii) {
        this.pret = pret;
        this.calorii = calorii;
    }

    public Supa getSupe(TipSupa tip, float cantitate) { // alegem cantitate deoarece este ceva modificabil de catre client de exemplu
        switch(tip){
            case LEGUME -> {
                SupaLegume supaLegume = new SupaLegume(pret, cantitate, calorii);
                return supaLegume;
            }
            case VITA -> {
                SupaVita supaVita = new SupaVita(pret, cantitate, calorii);
                return supaVita;
            }
            case COCOCS -> {
                SupaCocos supaCocos = new SupaCocos(pret, cantitate, calorii);
                return supaCocos;
            }
//            default -> {
//                return null;
//            }
        }
        return null;
    }
}
