package ro.cts.main;

import ro.cts.clase.Book;
import ro.cts.clase.BookAbstract;
import ro.cts.clase.BookFactory;
import ro.cts.clase.BorrowRecord;

public class Main {
    public static void main(String[] args) throws Exception {
        BookFactory factory = new BookFactory();

        BookAbstract book1 = factory.getBook("Java","Ionut",1223);
        book1.afiseaza(new BorrowRecord("Laert",25));

        BookAbstract book2 = factory.getBook("Python","Alin",1223);
        book2.afiseaza(new BorrowRecord("Andrea",26));

        }
    }
