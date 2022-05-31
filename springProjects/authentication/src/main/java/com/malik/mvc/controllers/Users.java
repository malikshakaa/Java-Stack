package com.malik.mvc.controllers;

import java.security.Principal;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.malik.mvc.models.User;
import com.malik.mvc.services.UserService;

@Controller
public class Users {
    private UserService userService;
    // code removed for brevity
    
//    @PostMapping("/registration")
//    public String registration(@Valid @ModelAttribute("user") User user, BindingResult result, Model model) {
//    	userValidator.validate(user, result);
//        if (result.hasErrors()) {
//            return "registrationPage.jsp";
//        }
//        userService.saveUserWithAdminRole(user);
//        return "redirect:/login";
//    }
     
    // NEW 
    @RequestMapping("/admin")
    public String adminPage(Principal principal, Model model) {
        String username = principal.getName();
        model.addAttribute("currentUser", userService.findByUsername(username));
        return "adminPage.jsp";
    }
    
    // code removed for brevity
}