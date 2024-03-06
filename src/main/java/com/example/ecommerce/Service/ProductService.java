package com.example.ecommerce.Service;


import com.example.ecommerce.Model.Product;
import com.example.ecommerce.Repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;


    public Product addProduct(Product product){
       return productRepository.save(product);

    }

    public List<Product> getProducts(){
        return productRepository.findAll();

    }

    public void deleteProductById(Long id){
        productRepository.deleteById(id);
    }
}
