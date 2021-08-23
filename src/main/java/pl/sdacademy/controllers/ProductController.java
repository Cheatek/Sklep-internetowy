package pl.sdacademy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.sdacademy.entities.Product;
import pl.sdacademy.repositories.ProductRepository;
import pl.sdacademy.services.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable long id) {
        return productService.getById(id);
    }
    @PostMapping("/addProduct")
    public void add(@RequestBody Product product){
        productService.add(product);
    }
    @GetMapping("/getAllProducts")
    public List<Product> getAll(){
       return productService.getAll();
    }
}