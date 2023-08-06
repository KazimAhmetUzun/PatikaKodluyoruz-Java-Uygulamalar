package BookList;

import java.time.LocalDate;

class Book {
    private String title;
    private int pageCount;
    private String authorName;
    private LocalDate publishDate;

    public Book(String title, int pageCount, String authorName, LocalDate publishDate) {
        this.title = title;
        this.pageCount = pageCount;
        this.authorName = authorName;
        this.publishDate = publishDate;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getPageCount() {
        return pageCount;
    }
}
