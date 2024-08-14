package com.quth.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;


@Controller
public class LoginController {

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("message", "Welcome to our website!");
        return "index"; // Thymeleaf template name (greeting.html)
    }
}
