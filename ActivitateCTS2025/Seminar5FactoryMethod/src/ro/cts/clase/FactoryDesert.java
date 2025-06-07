package ro.cts.clase;

public class FactoryDesert implements AbstractFactory{
    private String crema;

    public FactoryDesert(String crema) {
        this.crema = crema;
    }

    public void setCrema(String crema) {
        this.crema = crema;
    }

    @Override
    public FelDeMancare creareFelDeMancare(TipFelDeMancare tipFelDeMancare, float pret, float calorii) {
        switch (tipFelDeMancare){
            case Deserturi.PAPANASI -> {
                return new Papanasi(pret, calorii, crema);
            }
            case Deserturi.TIRAMISU -> {
                return new Tiramisu(pret, calorii, crema);
            }
            case null, default -> {
                return null;

            }
        }
    }
}
