package library.books;

public class FictionBook extends Book{
    public String genre;
    public FictionBook(String author, String title, int pages, boolean availability, String genre){
        super(author, title, pages, availability);
        this.genre = genre;
    }
}
