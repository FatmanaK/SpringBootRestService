package com.learningspring.service;

import com.learningspring.controller.Library;
import com.learningspring.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LibraryService {

    @Autowired
    LibraryRepository repository;

    public String buildID(String isbn, int aisle){
        return isbn+aisle;
    }

    public boolean checkBookAlreadyExist(String id){

        Optional<Library> lib=repository.findById(id);
        if (lib.isPresent()) {
            return true;
        }else {
            return false;
        }
    }
}
