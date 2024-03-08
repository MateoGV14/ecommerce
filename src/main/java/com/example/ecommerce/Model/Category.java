package com.example.ecommerce.Model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank(message = "cant be empty")
    private String name;

    @ManyToMany(mappedBy = "categories")
    private List<Product> products = new ArrayList<>();
}
