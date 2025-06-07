package ro.cts.main;


import ro.cts.clase.Curs;
import ro.cts.clase.Departament;
import ro.cts.clase.Faculty;
import ro.cts.clase.Structura;

public class Main {
    public static void main(String[] args) {
        Structura f1 = new Faculty("Informatica");
        Structura d1 = new Departament("Programming");
        Structura d2 = new Departament("Mathematics");
        Structura c1 = new Curs("Java");
        Structura c2 = new Curs("Python");
        Structura c3 = new Curs("Algebra");
        try{
            f1.adaugaStructura(d1);
            f1.adaugaStructura(d2);
            d1.adaugaStructura(c1);
            d1.adaugaStructura(c2);
            d2.adaugaStructura(c3);
            f1.afiseazaStructura();


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    }




