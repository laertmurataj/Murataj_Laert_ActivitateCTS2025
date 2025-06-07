package ro.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Faculty implements Structura{
    private String name;
    private List<Structura> listaFaculty;

    public Faculty(String name) {
        this.name = name;
        this.listaFaculty = new ArrayList<>();
    }

    @Override
    public void adaugaStructura(Structura structura)throws Exception {
        listaFaculty.add(structura);

    }

    @Override
    public void stergeStructura(Structura structura)throws Exception {
        listaFaculty.remove(structura);

    }

    @Override
    public void afiseazaStructura() {
        System.out.println("Faculty: "+this.name +" are departamente: ");
        for(Structura s: listaFaculty){
            s.afiseazaStructura();
        }

    }

    @Override
    public Structura getStructura(int index) throws Exception {
        return listaFaculty.get(index);
    }
}
