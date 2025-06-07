package ro.cts.main;

import ro.cts.clase.Rezervare;
import ro.cts.clase.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        RezervareBuilder builder = new RezervareBuilder("Tudor");
        Rezervare rezervare = builder.setHasAsezareGeam(true).setGenMuzica("Rock").build();
        Rezervare rezervare2 = builder.setHasAsezareGeam(true).setHasDecorareMasa(true).setGenMuzica("Metal").build();
        // este aceeasi instanta pentru aceasta varianta de builder, practic se foloseste cand stim ca o sa avem o singura instanta de obiect
        System.out.println(rezervare);
        System.out.println(rezervare2);
    }
}