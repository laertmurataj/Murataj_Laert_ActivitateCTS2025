package ro.cts.clase;

public class Tramvai extends InfoTransport{

//    public Tramvai(InfoTransport unMijloc) {
//        super(unMijloc);
//    }

    @Override
    public void recomandaMijloc(int distanta) {
        if(distanta < 10){
            System.out.println("Calatorul poate sa ia tramvaiul.");
        } else {
            this.getUnMijloc().recomandaMijloc(distanta);
        }
    }
}
