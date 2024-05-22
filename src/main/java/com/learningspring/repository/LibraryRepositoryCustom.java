package com.learningspring.repository;

import com.learningspring.controller.Library;

import java.util.List;

public interface LibraryRepositoryCustom {

    List<Library> findAllByAuthor(String authorName);

}


