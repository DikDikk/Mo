package com.kamala.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yuemu on 2018/7/17.
 */

@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello() {
        return "hello,this is a springboot demo";
    }

}
