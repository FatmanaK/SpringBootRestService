package com.learningspring.repository;

import com.learningspring.controller.Library;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class LibraryRepositoryImpl implements LibraryRepositoryCustom{

    @Autowired
    LibraryRepository repository;

    @Override
    public List<Library> findAllByAuthor(String authorName) {
        List<Library>bookswithAuthor = new ArrayList<Library>();
        // TODO Auto-generated method stub
        List<Library>books =repository.findAll();
        for(Library item : books)
//			{
            if(item.getAuthor().equalsIgnoreCase(authorName))
            {
                bookswithAuthor.add(item);
            }
//			}

        return bookswithAuthor;
    }



}
