package com.learningspring.controller;


import com.learningspring.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static java.time.ZoneOffset.buildId;

@RestController
public class LibraryController {

    @Autowired
    LibraryRepository repository;

    @Autowired
    LibraryService service;

    @PostMapping("/addBook")
    public ResponseEntity addBookImplementation (@RequestBody Library library){

        String id=buildId(library.getIsbn()+library.getAisle());
        if(!LibraryService.checkBookAlreadyExist(id)
        {
            //checkBookAlreadyExist();
            AddResponse ad = new AddResponse();

            library.setId(id);
            // library.setId(library.getIsbn()+library.getAisle());
            repository.save(library);

            HttpHeaders headers = new HttpHeaders();
            headers.add("unique", id);
            ad.setMsg("Success book is added");
            ad.setId(library.getIsbn() + library.getAisle());
            // return ad;
            return new ResponseEntity<AddResponse>(ad, headers, HttpStatus.CREATED);
        }
        else{
            //write
        }



    }
}
