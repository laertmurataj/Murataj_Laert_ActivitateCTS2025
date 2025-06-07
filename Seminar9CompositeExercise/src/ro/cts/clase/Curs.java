package ro.cts.clase;

public class Curs implements Structura{
    private String name;

    public Curs(String name) {
        this.name = name;
    }

    @Override
    public void adaugaStructura(Structura structura) {

    }

    @Override
    public void stergeStructura(Structura structura) {

    }

    @Override
    public void afiseazaStructura() {

        System.out.println("Curs: "+this.name);


    }

    @Override
    public Structura getStructura(int index) throws Exception {
        return null;
    }
}
