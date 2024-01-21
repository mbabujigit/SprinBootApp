package com.javademos.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping(value = "/")
    @ResponseBody
    public String home(){
        return "Spring Boot Application - Hello World!";
    }

}
