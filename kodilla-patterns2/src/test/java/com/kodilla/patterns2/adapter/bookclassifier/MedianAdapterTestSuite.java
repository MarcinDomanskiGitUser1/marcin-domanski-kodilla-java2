package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;
import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        // Given
        Set<Book> newBooks = new HashSet();
        newBooks.add(new Book("Pierwszy Autor", "Pierwsza Książka", 2001, "12xz"));
        newBooks.add(new Book("Drugi Autor", "Drugi tytuł", 2002, "13bn"));
        newBooks.add(new Book("Trzeci Autor", "Trzeci tytuł", 2013, "14hg"));
        newBooks.add(new Book("Czwarty Autor", "Czwarty tytuł", 2021, "15lk"));
        newBooks.add(new Book("Piąty Autor", "Piąty tytuł", 2005, "16po"));

        MedianAdapter medianAdapter = new MedianAdapter();
        // When
        int median = medianAdapter.publicationYearMedian(newBooks);
        // Then
        assertEquals(2005, median);
    }
}
