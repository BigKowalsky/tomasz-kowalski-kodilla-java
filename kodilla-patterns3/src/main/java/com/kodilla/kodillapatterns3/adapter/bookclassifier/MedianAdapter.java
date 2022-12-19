package com.kodilla.kodillapatterns3.adapter.bookclassifier;

import com.kodilla.kodillapatterns3.adapter.bookclassifier.librarya.Book;
import com.kodilla.kodillapatterns3.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.kodillapatterns3.adapter.bookclassifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.kodillapatterns3.adapter.bookclassifier.libraryb.Book> booksMap = new HashMap<>();
        for(Book book : bookSet){
            BookSignature tempBookSignature = new BookSignature(book.getSignature());
            com.kodilla.kodillapatterns3.adapter.bookclassifier.libraryb.Book tempNewBook =
                    new com.kodilla.kodillapatterns3.adapter.bookclassifier.libraryb.Book (book.getAuthor(), book.getTitle(), book.getPublicationYear());
            booksMap.put(tempBookSignature, tempNewBook);
        }
        return medianPublicationYear(booksMap);
    }
}
