package com.malik.mvc.controllers;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.malik.mvc.models.TravelModel;
import com.malik.mvc.services.TravelService;
@Controller
public class MainController {
	
	private final TravelService TravelService;
	public MainController (TravelService TravelService ){
		this.TravelService = TravelService;
	}
	
	
    @PostMapping("/add")
    public String create(@Valid @ModelAttribute("travel") TravelModel travel, BindingResult result) {
        if (result.hasErrors()) {
            return "index.jsp";
        } else {
            TravelService.creatTravel(travel);
            return "redirect:/expenses";
        }
        
    }
    
    @GetMapping(value="/expenses")
    public String allTravels(Model model,@ModelAttribute("travel") TravelModel travel) {
    	List<TravelModel>travels=TravelService.allTravels();
    	model.addAttribute("travels",travels);
    	return "index.jsp";

    }	
}
	
	

