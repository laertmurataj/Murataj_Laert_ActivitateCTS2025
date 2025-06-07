package ro.cts.clase;

public abstract class  TemplatePlata {
    public final void efectuazaPlata(Client client){
        verificareCont(client);
        autorizarePlata(client);
        finalizarePlata();


    }
    public abstract void verificareCont(Client client);
    public abstract void autorizarePlata(Client client);
    public abstract void finalizarePlata();
}
