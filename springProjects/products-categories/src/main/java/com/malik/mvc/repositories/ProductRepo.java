package com.malik.mvc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.malik.mvc.models.Category;
import com.malik.mvc.models.Product;

@Repository
public interface ProductRepo extends CrudRepository<Product,Long> {
    List<Product> findAll();
    
    // Retrieves a list of any categories a particular product
    // does not belong to.
    List<Product> findByCategoriesNotContains(Category category);


}
