package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping({"", "/"})
    public String index() {
        return "index";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/login-error")
    public String loginError(Model model){
        model.addAttribute("loginError", true);
        return "login";
    }

    @RequestMapping("/registration/new")
    public String registration() {
        return "registration/new";
    }

    @RequestMapping("/registration-error")
    public String regError(Model model) {
        model.addAttribute("regError",true);
        return "registration";
    }
}

