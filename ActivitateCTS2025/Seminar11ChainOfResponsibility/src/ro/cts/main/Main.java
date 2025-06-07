package ro.cts.main;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        InfoTransport troleibuz = new Troleibuz();
        InfoTransport autobuz = new Autobuz();
        InfoTransport tramvai = new Tramvai();
        InfoTransport metrou = new Metrou();

//         lantul in ordine
        troleibuz.setUnMijloc(autobuz);
        autobuz.setUnMijloc(tramvai);
        tramvai.setUnMijloc(metrou);
        metrou.setUnMijloc(null);

        troleibuz.recomandaMijloc(5);
        troleibuz.recomandaMijloc(2);
        troleibuz.recomandaMijloc(12);
        troleibuz.recomandaMijloc(4);
        troleibuz.recomandaMijloc(7);

    }
}