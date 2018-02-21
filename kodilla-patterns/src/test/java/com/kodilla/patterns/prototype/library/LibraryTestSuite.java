package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        Library library = new Library("Publio");
        Book book1 = new Book("Pentagram", "Jo Nesbo", LocalDate.of(2012, 01, 01));
        Book book2 = new Book("Karaluchy", "Jo Nesbo", LocalDate.of(2014, 01, 01));
        Book book3 = new Book("Pragnienie", "Jo Nesbo", LocalDate.of(2016, 01, 01));
        Book book4 = new Book("Czlowiek nietoperz", "Jo Nesbo", LocalDate.of(2018, 01, 01));

        library.books.add(book1);
        library.books.add(book2);
        library.books.add(book3);
        library.books.add(book4);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Publio v2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        System.out.println(library);
        System.out.println(clonedLibrary);

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Publio v3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        System.out.println(deepClonedLibrary);

        Assert.assertEquals(4, library.getBooks().size());
        Assert.assertEquals(4, clonedLibrary.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());
    }
}
