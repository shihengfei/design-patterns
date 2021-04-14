package com.camelot.designpatterns.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * demo
 */
@RestController
public class DemoController {

    @GetMapping("get")
    public String get(){
        System.out.println();
        return "fourjkhdskahhfkjhk";
    }

}
