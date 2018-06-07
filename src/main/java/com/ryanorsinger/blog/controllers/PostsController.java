package com.ryanorsinger.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostsController {

    @GetMapping("/posts")
    public String index(){
        return "posts/index";
    }


    @GetMapping("/posts/create")
    public String create() {
        return "posts/create";
    }

    @PostMapping("/posts/create")
    public String store() {
        return "foo";
    }

    @GetMapping("/posts/{id}")
    public String show(@PathVariable long id, Model model) {
        model.addAttribute("id", id);
        return "posts/show";
    }

    @GetMapping("/posts/{id}/edit")
    public String edit(@PathVariable long id, Model model) {
        model.addAttribute("id", id);
        return "posts/edit";
    }

}
