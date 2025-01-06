package com.mycompany;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;  // <-- Add this import

@Controller
public class MainController {
    @GetMapping("")  // <-- @GetMapping annotation should work now
    public String showHomePage() {
        System.out.println("main controller");
        return "index";  // This will return the "index" view (usually a Thymeleaf or JSP file)
    }
}
