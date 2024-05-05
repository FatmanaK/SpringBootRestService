package com.learningspring.controller;


import com.learningspring.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

    @Autowired
    LibraryRepository repository;

    @PostMapping("/addBook")
    public ResponseEntity addBookImplement (@RequestBody Library library){

           AddResponse ad = new AddResponse();
           library.setId(library.getIsbn()+library.getAisle());
           repository.save(library);
           ad.setMsg("Success book is added");
           ad.setId(library.getIsbn()+library.getAisle());
          // return ad;
        return new ResponseEntity<AddResponse>(ad, HttpStatus.CREATED);



    }
}
