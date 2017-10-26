package com.example.lab4subject.com.example.lab4subject.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class WordControllerLab4 {

    @Value("${words}")
    String words;

    @GetMapping("/")
    public @ResponseBody String getWord(){
        String[] wordArray = words.split(",");
        return Arrays.stream(wordArray).findAny().get();
    }

}
