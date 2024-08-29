package com.quth.demo.Controller;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/home")
    public String home(OAuth2AuthenticationToken authentication, Model model) {
        model.addAttribute("name", authentication.getPrincipal().getAttributes().get("name"));
        model.addAttribute("email", authentication.getPrincipal().getAttributes().get("email"));
        return "home";
    }
}
