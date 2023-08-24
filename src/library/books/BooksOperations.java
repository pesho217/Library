package library.books;

import java.util.ArrayList;
import java.util.UUID;

public interface BooksOperations {
    public void displayToString();

    public UUID getISBN();

    public String getAuthor();

    public String getTitle();

    public boolean getAvailability();

    public void setAuthor(String author);

    public void setTitle(String title);

    public void setAvailability(boolean availability);

    public Book findBookByISBN(UUID ISBN);

    public Book findBookByTitleAndAuthor(String title, String author);
    public void findBooksByMorePagesThan(int pageNumber);

    public void findBooksByLessPagesThan(int pageNumber);

    public void findBooksByAuthor(String author);
}
