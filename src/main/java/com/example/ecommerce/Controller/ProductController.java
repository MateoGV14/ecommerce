package com.example.ecommerce.Controller;


import com.example.ecommerce.Model.Product;
import com.example.ecommerce.Service.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Validated
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;


    @GetMapping
    public List<Product> getAllProducts(){
        return  productService.getProducts();
    }

    @PostMapping
    public Product addProduct( @Valid @RequestBody Product product){
        return productService.addProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable Long id){
        productService.deleteProductById(id);
    }
}
