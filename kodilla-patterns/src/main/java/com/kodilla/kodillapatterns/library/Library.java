package com.kodilla.kodillapatterns.library;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype {

    String name;
    public Set<Book> books = new HashSet<>();

    public Library( String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }
    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library)super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = (Library)super.clone();
        clonedLibrary.books = new HashSet<>();
        for(Book book : books) {
            Book clonedBook = new Book(book.title,book.title,book.publicationDate);
            clonedLibrary.getBooks().add(clonedBook);
        }
        return clonedLibrary;
    }

    @Override
    public String toString(){
        return "\nLibrary = "+this.name +
                " Books: "+this.getBooks().toString();
    }
}
