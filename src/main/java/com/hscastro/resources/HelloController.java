package com.hscastro.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String getHello() {
        return "Hello world!";
    }
}
