package com.malik.mvc.controllers;
	
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.malik.mvc.models.TravelModel;
import com.malik.mvc.services.TravelService;



@Controller
public class MainController {
	
	private final TravelService travelService;
	public MainController(TravelService travelService) {
		this.travelService = travelService;
	}
	
	@GetMapping("/travels")
    public String index(Model model,@ModelAttribute("travel") TravelModel travel) {
        List<TravelModel> item = travelService.allTravels();
        model.addAttribute("travels", item);
        return "main.jsp";
    }
	
	@PostMapping("/travels/create")
    public String create(@Valid @ModelAttribute("travel") TravelModel travel, BindingResult result,Model model) {
        if (result.hasErrors()) {
        	List<TravelModel> item = travelService.allTravels();
            model.addAttribute("travels", item);
            return "main.jsp";
        } else {
        	travelService.creatTravel(travel);
            return "redirect:/travels";
        }
    }
	
	@GetMapping("/travels/{id}/edit")
    public String edit(@PathVariable("id") Long id, Model model) {
		TravelModel item = travelService.findTravel(id);
		model.addAttribute("travels", item);
        return "editform.jsp";
    }
	
	@PutMapping("/travels/{id}/edit/update")
    public String update(@Valid @ModelAttribute("travels") TravelModel item, BindingResult result) {
        if (result.hasErrors()) {
            return "editform.jsp";
        } else {
        	travelService.updateTravel(item);
            return "redirect:/travels";
        }
    }
	@GetMapping("/travels/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
		TravelModel item = travelService.findTravel(id);
		model.addAttribute("travels", item);
        return "show.jsp";
    }
	
	@DeleteMapping("/travels/{id}/delete")
    public String destroy(@PathVariable("id") Long id) {
		travelService.eleteTravel(id);
        return "redirect:/travels";
    }
}
	
	

