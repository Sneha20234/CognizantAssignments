package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

public class Main {
    public static void main(String[] args) {
        // Load the Spring context from the applicationContext.xml file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the BookService bean from the context
        BookService bookService = (BookService) context.getBean("bookService");

        // Call the getAllBooks method to test the configuration
        bookService.getAllBooks();
    }
}
