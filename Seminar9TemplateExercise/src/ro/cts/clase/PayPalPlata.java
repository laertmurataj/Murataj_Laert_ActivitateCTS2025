package ro.cts.clase;

public class PayPalPlata extends TemplatePlata{


    @Override
    public void verificareCont(Client client) {
        System.out.println("Verificare cont PayPal pentru: "+client.getNume());

    }

    @Override
    public void autorizarePlata(Client client) {
        System.out.println("Autorizare suma: "+client.getSuma()+" prin paypal");

    }

    @Override
    public void finalizarePlata() {
        System.out.println("Tranzactie finalizata prin Paypal");

    }
}
