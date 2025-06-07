package ro.cts.clase;

import java.util.HashMap;

public class BookFactory {
    private HashMap<Integer,BookAbstract> colectieBook;

    public BookFactory() { colectieBook = new HashMap<>();
    }
    public BookAbstract getBook(String title,String author,int isbn){
        BookAbstract book = colectieBook.get(isbn);
        if(book == null){
            book = new Book(title,author,isbn);
        }
        return book;
    }

}
