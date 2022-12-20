package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/test")
public class TestController {

    TestObject testObject = new TestObject();

    @GetMapping ("/")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping("/time")
    public long getTimeUserCreated(){
        return testObject.time;


    }

    @GetMapping("/user")
    public String getUserName(){
        return testObject.name;
    }


    @GetMapping("/validuser")
    public boolean isValiduser(){
        return testObject.isValidUser;
    }


}
