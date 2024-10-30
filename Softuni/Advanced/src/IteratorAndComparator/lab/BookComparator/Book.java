package IteratorAndComparator.lab.BookComparator;

import java.util.ArrayList;
import java.util.List;

public class Book {
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
}

