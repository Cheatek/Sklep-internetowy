package pl.sdacademy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.sdacademy.entities.Product;
import pl.sdacademy.repositories.ProductRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ProductController {
    private ProductRepository productRepository;

    @GetMapping("/{id}")
    public Product getById(@PathVariable long id) {
        return productRepository.getById(id);
    }
    @PostMapping("/addProduct")
    public void add(@RequestBody Product product){
        productRepository.save(product);
    }
    @GetMapping("/getAllProducts")
    public List<Product> getAll(){
       return productRepository.findAll();
    }
}
