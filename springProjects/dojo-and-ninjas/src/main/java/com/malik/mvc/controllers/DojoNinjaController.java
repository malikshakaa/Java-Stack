package com.malik.mvc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.malik.mvc.models.Dojo;
import com.malik.mvc.models.Ninja;
import com.malik.mvc.services.DojoService;
import com.malik.mvc.services.NinjaService;

@Controller
public class DojoNinjaController {
	private  DojoService dojoService;
	private  NinjaService ninjaService;
	


	
    public DojoNinjaController(DojoService dojoService, NinjaService ninjaService) {
		this.dojoService = dojoService;
		this.ninjaService = ninjaService;
	}


	@GetMapping("/")
    public String allDojos(Model model) {
    	List<Dojo> dojos = dojoService.allDojos();
    	model.addAttribute("dojos",dojos);
    	return"all-dojos.jsp";
    }
	
	
	
	
    @GetMapping("/ninjas/new")
    public String newNinja(@ModelAttribute("ninja") Ninja ninja ,Model model){
    		List<Dojo> dojos = dojoService.allDojos();
    		model.addAttribute("dojos",dojos);
        return "ninja.jsp";
    }
    @PostMapping("/ninjas/new/adding")
    public String addninja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
        if (result.hasErrors()) {
            return "ninja.jsp";
        } else {
            ninjaService.creatNinja(ninja);
            return "redirect:/";
        }
    }
    
	
        
//	
    @GetMapping("/dojos/new")
    public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
        return "dojo.jsp";
    }
    @PostMapping("/dojos/new/adding")
    public String adddojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
        if (result.hasErrors()) {
            return "dojo.jsp";
        } else {
            dojoService.creatDojo(dojo);
            return "redirect:/";
        }
    }
    @GetMapping("/dojos/{id}")
    public String dojoinfo (@PathVariable("id") Long id,Model model ) {
    	Dojo dojo =dojoService.findDojo(id);
    	model.addAttribute("thisdojo",dojo);
    	List<Ninja> ninjasindojo = ninjaService.ninjaInDojo(dojo);
    	model.addAttribute("ninjasindojo",ninjasindojo);
    	return "dojo_inf.jsp";
    	
    }
    
}
