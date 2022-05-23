package com.malik.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.malik.mvc.models.Category;
import com.malik.mvc.models.Product;
import com.malik.mvc.repositories.ProductRepo;

@Service
public class ProductService {
    private final ProductRepo productRepo;
    
    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }
    // returns all the books
    public List<Product> allProducts() {
        return productRepo.findAll();
    }
    // creates a book
    public Product createProduct(Product product) {
        return productRepo.save(product);
    }
    // retrieves a book
    public Product findProduct(Long id) {
        Optional<Product> optionalProduct = productRepo.findById(id);
        if(optionalProduct.isPresent()) {
            return optionalProduct.get();
        } else {
            return null;
        }
    }
    
    public void deleteproduct (Long id) {
    	productRepo.deleteById(id);
    }

}
