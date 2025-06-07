package ro.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Structura{

    private String name;
    private List<Structura> listaDepartament;

    public Departament(String name) {
        this.name = name;
        this.listaDepartament = new ArrayList<>();
    }

    @Override
    public void adaugaStructura(Structura structura)throws Exception {
        listaDepartament.add(structura);

    }

    @Override
    public void stergeStructura(Structura structura)throws Exception {
        listaDepartament.remove(structura);

    }

    @Override
    public void afiseazaStructura() {
        System.out.println("Departament: "+this.name +" are cursuri: ");
        for(Structura s: listaDepartament){
            s.afiseazaStructura();
        }

    }

    @Override
    public Structura getStructura(int index) throws Exception {
        return listaDepartament.get(index);
    }
}
