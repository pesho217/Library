package library.books;

public class AudioBook extends Book {
    public String voiceCover;
    public double recordLength;
    public AudioBook(String author, String title, int pages, boolean availability, String voiceCover, double recordLength){
        super(author, title, pages, availability);
        this.voiceCover = voiceCover;
        this.recordLength = recordLength;
    }
    public AudioBook(){}

}
