package ro.cts.clase;

public  abstract class MesajDecorator implements Mesaj{
    private Mesaj mesajSimplu;

    public MesajDecorator (Mesaj mesajSimplu){
        this.mesajSimplu = mesajSimplu;

    }

    @Override
    public void afisare() {
        mesajSimplu.afisare();
        afisareFelicitare();

    }
    protected abstract void afisareFelicitare();
}
