package ro.cts.clase;

public class MesajSimplu implements Mesaj{
    private String message;

    public MesajSimplu(String message){this.message = message;}

    @Override
    public void afisare() {
        System.out.println("Hello "+message);

    }

}
