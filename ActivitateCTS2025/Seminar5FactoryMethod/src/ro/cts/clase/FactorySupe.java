package ro.cts.clase;

public class FactorySupe implements AbstractFactory{
    private int cantitate;

    public FactorySupe(int cantitate) {
        this.cantitate = cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    @Override
    public FelDeMancare creareFelDeMancare(TipFelDeMancare tipFelDeMancare, float pret, float calorii) {
        switch (tipFelDeMancare){
            case Supe.LEGUME -> {
                return new SupaDeLegume(pret, calorii, cantitate);
            }
            case Supe.CIUPERCI -> {
                return new SupaDeCiuperci(pret, calorii, cantitate);
            }
            case null, default -> {
                return null;
            }
        }

    }
}
