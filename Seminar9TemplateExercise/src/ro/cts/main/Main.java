package ro.cts.main;

import ro.cts.clase.Client;
import ro.cts.clase.ContBancar;
import ro.cts.clase.PayPalPlata;
import ro.cts.clase.TemplatePlata;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Client client = new Client("Andrei",25.76);
        TemplatePlata method = new PayPalPlata();
        method.efectuazaPlata(client);
        TemplatePlata method1 = new ContBancar();
        method1.efectuazaPlata(client);

        }
    }
