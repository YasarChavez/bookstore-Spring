package com.bookstore.bookstore.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.bookstore.entity.Book;
import com.bookstore.bookstore.repository.BookRepository;

@Service
public class BookService {
    // Instanciamos el repositorio
    @Autowired
    private BookRepository bookRepository;

    public void save(Book b){
        bookRepository.save(b);
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }
}
