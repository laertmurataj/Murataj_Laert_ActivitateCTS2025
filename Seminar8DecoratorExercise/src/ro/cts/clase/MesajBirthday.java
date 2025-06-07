package ro.cts.clase;

public class MesajBirthday extends MesajDecorator{

    public MesajBirthday(Mesaj mesajSimplu){
        super(mesajSimplu);

    }
    @Override
    protected void afisareFelicitare() {
        System.out.println("Happy Birthday!");
    }
}
