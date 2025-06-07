package ro.cts.model.main;

import ro.cts.model.personal.*;
import ro.cts.model.platform.Curs;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Mihai", 20, 1, 900));
        students.add(new Student("Ana", 21, 2, 1000));
        Curs curs = new Curs("CTS", 4, new Profesor("Adrian", 35, 22, 4500, 0.35f), students);

        curs.sustineExamen("05/06/2025");
        curs.getProfesor().preda();
        System.out.println("Venitul profesorului: " + ((Persoana)curs.getProfesor()).calculareVenit());
        curs.setProfesor(new Asistent("Popescu", 27, 1, 3800));
        curs.sustineExamen("06/06/2025");

        Lector lector = new Lector("Gigel", 38);
        lector.preda();
        curs.setProfesor(lector);
        curs.sustineExamen("09/06/2025");
    }
}