package library.books;

import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;

public class Book implements BooksOperations{
    public String author;
    public String title;
    public boolean availability;
    public UUID ISBN = UUID.randomUUID();
    public ArrayList<Book> books = new ArrayList<>();
    public int pages;

    public Book(String author, String title, int pages, boolean availability){
        this.author = author;
        this.title = title;
        this.availability = availability;
        books.add(new Book(author, title, pages, availability));
    }
    @Override
    public Book findBookByISBN(UUID ISBN){
        for(Book book : books){
            if(book.getISBN() == ISBN){
                return book;
            }
        }
        System.out.println("Couldn't find this book!");
        return null;
    }
    @Override
    public Book findBookByTitleAndAuthor(String title, String author){
        for(Book book : books){
            if(Objects.equals(book.getTitle(), title) && book.getAuthor().equals(author)){
                return book;
            }
        }
        System.out.println("Couldn't find this book!");
        return null;
    }
    @Override
    public void findBooksByMorePagesThan(int pageNumber) {
        ArrayList<Book> books1 = new ArrayList<>();
        for (Book book : books) {
            if (book.pages > pageNumber) {
                books1.add(book);
            }
        }
        if (books1.size() == 0) {
            System.out.println("No books with number of pages more than: " + pageNumber);
        } else {

            for (Book book : books1) {
                book.displayToString();
            }
        }
    }
    @Override
    public void findBooksByLessPagesThan(int pageNumber) {
        ArrayList<Book> books1 = new ArrayList<>();
        for (Book book : books) {
            if (book.pages < pageNumber) {
                books1.add(book);
            }
        }
        if (books1.size() == 0) {
            System.out.println("No books with number of pages less than: " + pageNumber);
        } else {

            for (Book book : books1) {
                book.displayToString();
            }
        }
    }
    @Override
    public void findBooksByAuthor(String author) {
        ArrayList<Book> books1 = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                books1.add(book);
            }
        }
        if (books1.size() == 0) {
            System.out.println("No books with author name: " + author);
        } else {

            for (Book book : books1) {
                book.displayToString();
            }
        }
    }

    public Book(){}
    @Override
    public UUID getISBN(){
        return ISBN;
    }
    @Override
    public String getAuthor(){
        return author;
    }
    @Override
    public String getTitle(){return title;}
    @Override
    public boolean getAvailability(){return availability;}
    @Override
    public void setAuthor(String author){
        this.author = author;
    }
    @Override
    public void setTitle(String title){
        this.title = title;
    }
    @Override
    public void setAvailability(boolean availability){
        this.availability = availability;
    }
    @Override
    public void displayToString(){
        System.out.println("Title: " + title + ", Author: " + author +
                ", Pages: " + pages + ", availability in the library: " + availability) ;
    }
    }
