package Book;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Kitapları isme göre sıralayan Set
        Set<Book> bookSetByName = new TreeSet<>();
        bookSetByName.add(new Book("Java Programming", 350, "John Doe", "2022-01-15"));
        bookSetByName.add(new Book("Python in Action", 250, "Jane Smith", "2021-11-01"));
        bookSetByName.add(new Book("C++ Essentials", 400, "Michael Brown", "2023-03-10"));
        bookSetByName.add(new Book("Data Structures", 500, "Alice Green", "2022-07-22"));
        bookSetByName.add(new Book("Algorithms Made Easy", 300, "Bob Johnson", "2023-02-05"));

        System.out.println("Kitaplar isme göre sıralandı:");
        for (Book book : bookSetByName) {
            System.out.println(book);
        }

        // Kitapları sayfa sayısına göre sıralayan Set
        Set<Book> bookSetByPageCount = new TreeSet<>(Comparator.comparingInt(Book::getPageCount));
        bookSetByPageCount.addAll(bookSetByName);

        System.out.println("\nKitaplar sayfa sayısına göre sıralandı:");
        for (Book book : bookSetByPageCount) {
            System.out.println(book);
        }
    }
}
