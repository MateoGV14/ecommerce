package com.example.ecommerce.Controller;

import com.example.ecommerce.Model.Category;
import com.example.ecommerce.Service.CategoryService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
@Validated
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping
    public List<Category> getAllProducts(){
        return categoryService.getCategories();
    }

    @PostMapping
    public Category addCategory(@Valid @RequestBody Category category){
        return categoryService.addCategory(category);
    }

    @DeleteMapping("/{id}")
    public void deleteCategoryById( @PathVariable Long id){
        categoryService.deleteCategoryById(id);
    }
}
