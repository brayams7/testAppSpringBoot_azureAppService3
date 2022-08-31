package com.springBoot.testAppAzureAppService2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @GetMapping("/message")
    public ResponseEntity<String> helloWorld(){
        return new ResponseEntity<>("Hola mundo", HttpStatus.OK);
    }
}
