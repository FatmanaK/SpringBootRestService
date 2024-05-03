package com.learningspring.controller;

import org.springframework.stereotype.Component;

@Component
public class Greeting {
//we create 2 variables and create getter and setter for these (this is how we define in Java bin.)
    private long id;
    private  String content;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }



}
