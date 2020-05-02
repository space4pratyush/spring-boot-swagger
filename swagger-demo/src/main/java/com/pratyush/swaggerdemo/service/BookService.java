package com.pratyush.swaggerdemo.service;

import com.pratyush.swaggerdemo.dao.BookRepository;
import com.pratyush.swaggerdemo.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    public  String saveBook(Book book){
        repository.save(book);
        return  "book saved with id :"+book;
    }

    public Optional<Book> getBook(int bookId){
        Optional<Book> book=repository.findById(bookId);
        return book;
    }
}
