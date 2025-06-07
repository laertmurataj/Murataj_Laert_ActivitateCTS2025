package ro.cts.clase;

public class ContBancar extends TemplatePlata{
    @Override
    public void verificareCont(Client client) {
        System.out.println("Verificare cont bancar pentru client: "+client.getNume());
    }

    @Override
    public void autorizarePlata(Client client) {
        System.out.println("Autorizare suma: "+client.getSuma()+" prin cont bancar");

    }

    @Override
    public void finalizarePlata() {
        System.out.println("Tranzactie finalizata prin cont bancar");

    }
}
