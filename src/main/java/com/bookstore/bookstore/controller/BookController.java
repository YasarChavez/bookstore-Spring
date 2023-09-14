package com.bookstore.bookstore.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bookstore.bookstore.entity.Book;
import com.bookstore.bookstore.service.BookService;

@Controller

public class BookController {
    // Instanciamos el servicio
    @Autowired
    private BookService bookService;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/book_register")
    public String book_register() {
        return "bookRegister";
    }

    @GetMapping("/available_books")
    public ModelAndView getAllBooks() {
        List<Book> list = (List<Book>) bookService.getAllBooks();
        // ModelAndView mv=new ModelAndView();
        // mv.setViewName("booklist");
        // mv.addObject("book", list);
        return new ModelAndView("booklist", "book", list);
    }

    @PostMapping("/save")
    public String addBook(@ModelAttribute Book b) {
        bookService.save(b);
        return "redirect:/available_books";
    }

    @GetMapping("/my_books")
    public String getMyBooks(){
        return "myBooks";
    }
    

}
