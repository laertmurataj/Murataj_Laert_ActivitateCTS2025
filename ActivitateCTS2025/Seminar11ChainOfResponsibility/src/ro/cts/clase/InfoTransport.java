package ro.cts.clase;

public abstract class InfoTransport {
    private InfoTransport unMijloc;

    // fara constructor

    public InfoTransport getUnMijloc() {
        return unMijloc;
    }

    public void setUnMijloc(InfoTransport unMijloc) {
        this.unMijloc = unMijloc;
    }

    public abstract void recomandaMijloc(int distanta);
}
