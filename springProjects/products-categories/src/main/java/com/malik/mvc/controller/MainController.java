package com.malik.mvc.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.malik.mvc.models.Category;
import com.malik.mvc.services.CategoryService;
import com.malik.mvc.services.ProductService;

@Controller
public class MainController {
	private final ProductService productService;
	private final CategoryService categoryService;
	

public MainController (ProductService productService,CategoryService categoryService) {
	this.productService = productService;
	this.categoryService = categoryService;
}
@GetMapping("/")
public String allProductCategory(Model model) {
	List<Category> category = categoryService.allCategories();
	model.addAttribute("categories", category);
	return "home.jsp";
}

@GetMapping("/addcateg")
public String newDojo(@ModelAttribute("categories") Category category) {
    return "newcategory.jsp";
}




@PostMapping("/categories/new/adding")
public String adddojo(@Valid @ModelAttribute("categories") Category category, BindingResult result) {
    if (result.hasErrors()) {
        return "newcategory.jsp";
    } else {
        categoryService.createCategory(category);
        return "redirect:/";
    }

}


}