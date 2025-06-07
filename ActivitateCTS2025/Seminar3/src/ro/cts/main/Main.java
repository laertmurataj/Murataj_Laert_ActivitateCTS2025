package ro.cts.main;

import ro.cts.clase.AutoritateReglementareMasiniEager;
import ro.cts.clase.AutoritateReglementareMasiniLazy;

public class Main {
    public static void main(String[] args) {
        AutoritateReglementareMasiniEager autoritate = AutoritateReglementareMasiniEager.getInstance();
        System.out.println(autoritate);

        AutoritateReglementareMasiniEager autoritate2 = AutoritateReglementareMasiniEager.getInstance();
        autoritate2.setWebsite("www.sitenou.ro");
        System.out.println(autoritate2);

        autoritate2.reglementeazaModel("Logan");
        System.out.println(autoritate2);

        AutoritateReglementareMasiniLazy lazy1 = AutoritateReglementareMasiniLazy.getInstance("KORSlazy", "www.website.org");
        System.out.println(lazy1);

        AutoritateReglementareMasiniLazy lazy2 = AutoritateReglementareMasiniLazy.getInstance("EURlazy", "www.eur.org");
        System.out.println(lazy2);
    }
}