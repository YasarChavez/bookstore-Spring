package com.bookstore.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.bookstore.entity.Book;
@Repository
public interface BookRepository extends JpaRepository<Book,Integer>{
    
}
