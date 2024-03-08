package com.example.ecommerce.Service;

import com.example.ecommerce.Model.Category;
import com.example.ecommerce.Repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public Category addCategory(Category category){
      return categoryRepository.save(category);
    }

    public List<Category> getCategories(){
        return categoryRepository.findAll();
    }

    public void deleteCategoryById(Long id){
        categoryRepository.deleteById(id);
    }
}
