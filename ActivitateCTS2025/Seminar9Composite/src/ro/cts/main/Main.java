package ro.cts.main;

import ro.cts.clase.Departament;
import ro.cts.clase.Sectie;
import ro.cts.clase.Structura;

public class Main {
    public static void main(String[] args) {
        Structura departament1 = new Departament("pediatrie", 34);
        Structura departament2 = new Departament("icu", 23);
        Structura departament3 = new Departament("general", 45);

        Sectie sectie1 = new Sectie("sectie1");
        Sectie sectie2 = new Sectie("sectie2");
        Sectie sectie3 = new Sectie("sectie3");

        try{
//            departament3.adaugaStructura(departament1);
////            departament3.adaugaStructura(departament2);
////
////            departament1.adaugaStructura(sectie1);
////            departament2.adaugaStructura(sectie2);
            departament3.adaugaStructura(sectie3);

            departament3.afiseazaDescriere();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}