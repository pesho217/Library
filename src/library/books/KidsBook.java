package library.books;

public class KidsBook extends Book{
    public boolean hardCover;
    public boolean colorfulIllustrations;
    public KidsBook(String author, String title, int pages, boolean availability, boolean hardCover,boolean colorfulIllustrations){
        super(author, title, pages, availability);
        this.hardCover = hardCover;
        this.colorfulIllustrations = colorfulIllustrations;
    }

}
