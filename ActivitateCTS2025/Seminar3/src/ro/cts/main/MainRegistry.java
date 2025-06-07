package ro.cts.main;

import ro.cts.registry.Autoritate;
import ro.cts.registry.Reglementare;

public class MainRegistry {
    public static void main(String[] args){

        Autoritate autoritate = Autoritate.getInstance("Autoritate", "www.autoritatemare.ro");
        Reglementare reglementare = autoritate.reglementeazaModel("Logan");
        Reglementare reglementare2 = autoritate.reglementeazaModel("Cybertruck");
        System.out.println(reglementare);
        System.out.println(reglementare2);
        System.out.println(autoritate);

        // se afiseaza tot prima reglementare, pentru ca exista deja Logan -> Singleton corect
        Reglementare reglementare3 = autoritate.reglementeazaModel("Logan");
        System.out.println(reglementare3);

    }
}
