package IteratorAndComparator.lab.ComparableBook;

import java.util.ArrayList;
import java.util.List;

public class Book implements Comparable<Book> {

    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... authors) {
        setTitle(title);
        setYear(year);
        setAuthors(authors);
    }

    //+getTitle(): String
    //+getYear(): int
    //+getAuthors(): List<String>
    public String getTitle() {
        return this.title;
    }

    //-setTitle(String)
    //-setYear(String)
    //-setAuthors(String…)
    private void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return this.year;
    }

    private void setYear(int year) {
        this.year = year;
    }

    public List<String> getAuthors() {
        return this.authors;
    }

    // 0 или повече автора
    private void setAuthors(String... authors) {
        this.authors = new ArrayList<>();
        for (String author : authors) {
            this.authors.add(author);
        }
    }

    // book1.compareTo(book2)
    public int compareTo(Book otherBook) {

        //The book has to be compared by title. When the title is equal, compare them by year.
        int result = this.title.compareTo(otherBook.title);
        // Книгите имат същите заглавия
        if (result == 0) {
            result = Integer.compare(this.year, otherBook.year);
        }
        return result;
    }
}

