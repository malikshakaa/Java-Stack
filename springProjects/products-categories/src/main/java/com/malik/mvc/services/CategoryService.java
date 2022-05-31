package com.malik.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.malik.mvc.models.Category;
import com.malik.mvc.models.Product;
import com.malik.mvc.repositories.CategoryRepo;

@Service
public class CategoryService {
	
    private final CategoryRepo categoryRepo;
    
    public CategoryService(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }
    // returns all the books
    public List<Category> allCategories() {
        return categoryRepo.findAll();
    }
    // creates a book
    public Category createCategory(Category category) {
        return categoryRepo.save(category);
    }
    // retrieves a book
    public Category findCategory(Long id) {
        Optional<Category> optionalCatergory = categoryRepo.findById(id);
        if(optionalCatergory.isPresent()) {
            return optionalCatergory.get();
        } else {
            return null;
        }
    }
    
    public void deletecategory (Long id) {
    	categoryRepo.deleteById(id);
    }
    public List<Category> catntinprod (Product product){
    	return categoryRepo.findByProductsNotContains(product);
    }

}
