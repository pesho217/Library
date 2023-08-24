package library.books;

public class ScienceBook extends Book{
    public String topic;
    public ScienceBook(String author, String title, int pages, boolean availability, String topic){
        super(author, title, pages, availability);
        this.topic = topic;
    }
}
