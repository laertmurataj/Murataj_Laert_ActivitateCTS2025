package ro.cts.clase;

public class MesajGraduare extends MesajDecorator{
    public MesajGraduare(Mesaj mesajSimplu) {
        super(mesajSimplu);
    }

    @Override
    protected void afisareFelicitare() {
        System.out.println("Felicitari pentru absolvire! ");

    }
}
