package ro.cts.main;


import ro.cts.clase.Mesaj;
import ro.cts.clase.MesajBirthday;
import ro.cts.clase.MesajGraduare;
import ro.cts.clase.MesajSimplu;

public class Main {
    public static void main(String[] args) {
        Mesaj mesajSimplu = new MesajSimplu("Laert");
        mesajSimplu.afisare();
        Mesaj mesajBirthday = new MesajBirthday(mesajSimplu);
        mesajBirthday.afisare();
        Mesaj mesajGraduare = new MesajGraduare(mesajSimplu);
        mesajGraduare.afisare();
        Mesaj mesajGraduare1 = new MesajGraduare(mesajBirthday);
        mesajGraduare1.afisare();


        }
    }
