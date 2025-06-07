package ro.cts.clase;

public class Metrou extends InfoTransport{

//    public Metrou(InfoTransport unMijloc) {
//        super(unMijloc);
//    }

    @Override
    public void recomandaMijloc(int distanta) {
        if(distanta > 10){
            System.out.println("Calatorul trebuie sa ia metroul.");
        }
    }
}
