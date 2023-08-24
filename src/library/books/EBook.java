package library.books;

public class EBook extends Book{
    public String fileFormat;

    public EBook(String author, String title, int pages, boolean availability, String fileFormat){
        super(author, title, pages, availability);
        this.fileFormat = fileFormat;
    }
}
