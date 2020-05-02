package com.pratyush.swaggerdemo.controller;

import com.pratyush.swaggerdemo.entity.Book;
import com.pratyush.swaggerdemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService service;

    @PostMapping("/save")
    public  String saveOneBook(@RequestBody Book book){
        return  service.saveBook(book);
    }

    @GetMapping("/get/{id}")
    public Optional<Book> getOneBook(@PathVariable int id){
        return service.getBook(id);
    }

}
