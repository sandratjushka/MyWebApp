package com.mycompany;

import org.springframework.stereotype.Controller;

@Controller
public class MainController {
    @GetMapping("")
    public String showHomePage() {
        return "index";
    }
}