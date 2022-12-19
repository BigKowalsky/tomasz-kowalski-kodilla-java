package com.kodilla.kodillapatterns3.adapter.classifier;

import com.kodilla.kodillapatterns3.adapter.bookclassifier.MedianAdapter;
import com.kodilla.kodillapatterns3.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest(){
        //Given
        Set<Book> booksSet = new HashSet<>();
        booksSet.add(new Book("Andrzej Pilipiuk", "Kroniki Jakuba Wędrowycza", 2001, "ABC123321"));
        booksSet.add(new Book("Marek Krajewski", "Dżuma w Breslau", 2007, "CBD987789"));
        booksSet.add(new Book("Andrzej Sapkowski", "Ostatnie życzenie", 1993, "AFH345834"));
        booksSet.add(new Book("Jacek Piekara", "Młot na Czarownice", 2003, "JKM321987"));
        booksSet.add(new Book("Jacek Komuda", "Czarna bandera", 2008, "OPL908123"));
        MedianAdapter adapter = new MedianAdapter();
        //When
        int median = adapter.publicationYearMedian(booksSet);
        //Then
        System.out.println("Median of book publication in our library is year: " + median);
        assertEquals(2003, median);
    }
}
