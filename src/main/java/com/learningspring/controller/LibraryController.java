package com.learningspring.controller;

import com.learningspring.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

    @Autowired
    LibraryRepository repository;

    @PostMapping("/addBook")
    public void addBookImplement (@RequestBody Library library){
           library.setId(library.getIsbn()+library.getAisle());
           repository.save(library);
    }
}
