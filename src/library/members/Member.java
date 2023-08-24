package library.members;


import library.library1.Library;
import library.books.Book;

import java.util.ArrayList;

public class Member {
    public String name;
    public String address;
    public String phoneNumber;
    public ArrayList<Member> libraryMembers = new ArrayList<>();
    public ArrayList<Book> takenBooks = new ArrayList<>();

    public Member(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        libraryMembers.add(new Member(name, address, phoneNumber));
    }

    public Member() {
    }

    Library library = new Library();

    public void borrowBook(Book book) {
        this.takenBooks.add(book);
        library.borrowedBooksCount.put(book, library.borrowedBooksCount.getOrDefault(book, 0) + 1);
        library.borrowedBooksByMemberCount.put(this, library.borrowedBooksByMemberCount.getOrDefault(this, 0) + 1);
    }

    public void returnBook(Book book) {
        for (Book book1 : this.takenBooks) {
            if (book1.getISBN() == book.getISBN()) {
                this.takenBooks.remove(book);
            } else {
                System.out.println("This member doesn't have this Book!");
            }
        }
        library.borrowedBooksCount.put(book, library.borrowedBooksCount.getOrDefault(book, 0) - 1);
        library.borrowedBooksByMemberCount.put(this, library.borrowedBooksByMemberCount.getOrDefault(this, 0) - 1);
    }
}
