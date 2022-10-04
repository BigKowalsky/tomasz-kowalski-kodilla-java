package com.kodilla.kodillapatterns.prototype.library;

import com.kodilla.kodillapatterns.library.Book;
import com.kodilla.kodillapatterns.library.Library;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Book book1 = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", LocalDate.of(1950, 8, 1));
        Book book2 = new Book("Ballady i Romanse", "Adam Mickiewicz", LocalDate.of(1974, 5,1));
        Book book3 = new Book("Moralność Pani Dulskiej", "Gabriela Zapolska", LocalDate.of(1988, 11, 1));

        Library library = new Library("University Library");

        library.books.add(book1);
        library.books.add(book2);
        library.books.add(book3);

        Library clonedLibrary = null;
        try {

            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Municipal Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("National Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When
        library.books.remove(book2);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        assertEquals(2, library.getBooks().size());
        assertEquals(2, clonedLibrary.getBooks().size());
        assertEquals(3, deepClonedLibrary.getBooks().size());
        assertEquals(clonedLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
