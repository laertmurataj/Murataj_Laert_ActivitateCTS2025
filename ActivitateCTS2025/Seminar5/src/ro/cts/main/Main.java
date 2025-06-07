package ro.cts.main;

import ro.cts.clase.Rezervare;
import ro.cts.clase.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        RezervareBuilder builder = new RezervareBuilder();
        Rezervare rezervare = builder.setGenMuzica("Jazz").setHasScauneErgom(true).setHasAsezareGeam(true).build("Ionut");

        Rezervare rezervare2 = builder.setGenMuzica("Pop").setHasAsezareGeam(true).build("Razvan");

        System.out.println(rezervare);
        System.out.println(rezervare2);
    }
}