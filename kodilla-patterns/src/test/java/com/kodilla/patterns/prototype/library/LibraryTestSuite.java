package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {

        //Given
        Library library = new Library("Biblioteka miejska");
        library.getBooks().add(new Book("Włochy, przerwać mosty", "Guardiolo Capello", LocalDate.of(2018, 8, 1)));
        library.getBooks().add(new Book("Jak dojechać elektrykiem", "Sławomir Prądzik", LocalDate.of(2017,6, 20)));
        library.getBooks().add(new Book("Kawa na 100 zapachów", "Karolina Macchiato", LocalDate.of(2015, 3, 6)));
        library.getBooks().add(new Book("Przeżyć albo nie przeżyć", "Aleksander Filozofik", LocalDate.of(2001, 12, 13)));
        library.getBooks().add(new Book("Szopka na wiejskiej", "Chubert Polityński", LocalDate.of(2015, 5, 5)));

        Library shallowCopyLibrary = null;
        try {
            shallowCopyLibrary = library.shallowCopy();
            shallowCopyLibrary.setName("Biblioteczka miejska");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepCopyLibrary = null;
        try {
            deepCopyLibrary = library.deepCopy();
            deepCopyLibrary.setName("Gmach Biblioteki");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().add(new Book("Jestem poetą", "Piotr Wiersz", LocalDate.of(2010, 6, 30)));

        //Then
        System.out.println(library.getBooks());
        System.out.println(shallowCopyLibrary.getBooks());
        System.out.println(deepCopyLibrary.getBooks());
        
        Assert.assertEquals(6, library.getBooks().size());
        Assert.assertEquals(6, shallowCopyLibrary.getBooks().size());
        Assert.assertEquals(5, deepCopyLibrary.getBooks().size());
    }
}
