package ro.cts.clase;

public class Book implements BookAbstract{
    private String title;
    private String author;
    private int isbn;

    public Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void afiseaza(BorrowRecord borrowRecord) {
        System.out.println(this);
        System.out.println(borrowRecord);

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("title='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", isbn=").append(isbn);
        sb.append('}');
        return sb.toString();
    }
}
