package com.wtx.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {

    @ResponseBody
    @RequestMapping("/HelloWorld")
    public String sayHelloWorld(){
        return "HelloWorld";
    }
}
