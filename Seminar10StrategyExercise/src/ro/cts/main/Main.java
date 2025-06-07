package ro.cts.main;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        Editor e1 = new Editor("Hello class!");
        e1.display();
        e1.setTextFormator(new LowerCase());
        e1.display();
        e1.setTextFormator(new Capitalize());
        e1.display();
        e1.setTextFormator(new UpperCase());
        e1.display();

    }
}