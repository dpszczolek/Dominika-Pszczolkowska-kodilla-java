package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Set;

public class Library extends Prototype {
    String name;
    Set<Book> books = new HashSet<>();

    public Library(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library) super.clone();
    }
    @Override
    public String toString() {
        String s = "Library [" + name + "]\n";
        for(Book list : books) {
            s = s + list.toString() + "\n";
        }
        return s;
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = (Library) super.clone();
        clonedLibrary.books = new HashSet<>();
        for(Book theLibrary : books) {
            Book clonedList = new Book(theLibrary.getTitle(), theLibrary.getAuthor(), theLibrary.getPublicationDate());
            clonedLibrary.getBooks().add(clonedList);
        }
        return clonedLibrary;
    }
}
