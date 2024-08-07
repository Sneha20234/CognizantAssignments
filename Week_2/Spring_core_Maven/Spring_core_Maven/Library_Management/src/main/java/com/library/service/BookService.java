package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter for bookRepository
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Method to perform some service operation (for example, getting all books)
    public void getAllBooks() {
        System.out.println("Getting all books...");
        bookRepository.getBooks();
    }
}
