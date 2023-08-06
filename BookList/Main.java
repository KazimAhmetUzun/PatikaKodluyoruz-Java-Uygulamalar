package BookList;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        // Book sınıfından 10 tane nesne oluşturup bir ArrayList'e ekleyelim
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Kitap 1", 200, "Yazar 1", LocalDate.of(2022, 1, 1)));
        bookList.add(new Book("Kitap 2", 300, "Yazar 2", LocalDate.of(2020, 5, 15)));
        bookList.add(new Book("Kitap 3", 150, "Yazar 3", LocalDate.of(2019, 10, 25)));
        bookList.add(new Book("Kitap 4", 250, "Yazar 4", LocalDate.of(2021, 8, 5)));
        bookList.add(new Book("Kitap 5", 180, "Yazar 5", LocalDate.of(2018, 12, 12)));
        bookList.add(new Book("Kitap 6", 350, "Yazar 6", LocalDate.of(2017, 6, 30)));
        bookList.add(new Book("Kitap 7", 220, "Yazar 7", LocalDate.of(2023, 3, 20)));
        bookList.add(new Book("Kitap 8", 190, "Yazar 8", LocalDate.of(2016, 11, 8)));
        bookList.add(new Book("Kitap 9", 280, "Yazar 9", LocalDate.of(2020, 7, 10)));
        bookList.add(new Book("Kitap 10", 400, "Yazar 10", LocalDate.of(2015, 4, 3)));

        // Kitap isminin karşısında yazar ismi olacak şekilde yeni bir Map oluşturup yazdıralım
        Map<String, String> bookTitleToAuthorMap = bookList.stream()
                .collect(Collectors.toMap(Book::getTitle, Book::getAuthorName));

        System.out.println("Kitap İsmi -> Yazar İsmi Map'i:");
        bookTitleToAuthorMap.forEach((key, value) -> System.out.println(key + " -> " + value));

        // Sayfa sayısı 100'den fazla olan kitapları filtreleyip yeni bir liste olarak alalım
        List<Book> filteredBookList = bookList.stream()
                .filter(book -> book.getPageCount() > 100)
                .collect(Collectors.toList());

        System.out.println("\nSayfa Sayısı 100'den Fazla Olan Kitaplar:");
        filteredBookList.forEach(book -> System.out.println(book.getTitle()));
    }
}