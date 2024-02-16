package com.demo.SBProject1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/SB")
public class SBController {

    @GetMapping("/greeting")
    public String greeting(){
        return "Hello Pannu \n How are you";
    }
}
