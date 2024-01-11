package com.security.springjwt.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequiredArgsConstructor
public class MainController {

    @GetMapping("/")
    public String mainP(){
        return "main Controller!";
    }
}
