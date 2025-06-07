package ro.cts.clase;

public class Troleibuz extends InfoTransport{

//    public Troleibuz(InfoTransport unMijloc) {
//        super(unMijloc);
//    }

    @Override
    public void recomandaMijloc(int distanta) {
        if(distanta < 3){
            System.out.println("Calatorul o sa ia troleibuzul.");
        } else {
            this.getUnMijloc().recomandaMijloc(distanta);
        }
    }
}
