package library.library1;

import library.books.Book;
import library.members.Member;

import java.util.*;

public class Library implements LibraryOperations {
    public Map<Book, Integer> borrowedBooksCount = new HashMap<>();
    public Map<Member, Integer> borrowedBooksByMemberCount = new HashMap<>();

    public void displayMostActiveMembers(){
        ArrayList<Map.Entry<Member,Integer>> entryList = new ArrayList<>(borrowedBooksByMemberCount.entrySet());
        Comparator<Map.Entry<Member,Integer>> comparator = Comparator.comparing(Map.Entry ::getValue);
        entryList.sort(comparator);
        for (Map.Entry<Member,Integer> entry : entryList) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
    public void displayMostPopularBooks(){
        ArrayList<Map.Entry<Book, Integer>> entryList = new ArrayList<>(borrowedBooksCount.entrySet());
        Comparator<Map.Entry<Book, Integer>> comparator = Comparator.comparing(Map.Entry :: getValue);
        entryList.sort(comparator);
        for (Map.Entry<Book, Integer> entry : entryList){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

}
