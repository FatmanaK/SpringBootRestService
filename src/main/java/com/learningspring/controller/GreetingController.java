package com.learningspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    @Autowired //help you to atomatically create object for your class
    Greeting greeting;

    AtomicLong counter = new AtomicLong(); //this variable will keep the track of the counts
    //this variable should be part of your ID becasue ID is taking the counter value


    @GetMapping("/greeting")
    public Greeting greeting (@RequestParam(value="name")String name){

        greeting.setId(counter.incrementAndGet());
        greeting.setContent("Hey I am learning Spring Boot "+ name); //this method help you to set content
        //these are calling rest call
        return greeting;

    }

}
//Jackson library convert Object to Json string using Jackson API
//http://localhost:8080/greeting?name=Fatmana

