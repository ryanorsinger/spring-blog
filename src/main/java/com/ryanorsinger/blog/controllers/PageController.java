package com.ryanorsinger.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String home() {
        return "index";
    }


    @GetMapping("/resume")
    public String resume() {
        return "resume";
    }

    @GetMapping("/portfolio")
    public String portfolio() {
        return "portfolio";
    }


    // make a mapping for handling contact requests

}
