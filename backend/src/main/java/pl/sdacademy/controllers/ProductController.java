package pl.sdacademy.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import pl.sdacademy.entities.Product;
import pl.sdacademy.services.ProductService;

import java.util.List;


@RestController
@CrossOrigin("http://localhost:4200/")
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/product/id/{id}")
    public Product getById(@PathVariable long id) {
        return productService.getById(id);
    }
    @PostMapping("/addProduct")
    public Product add (@RequestBody @Validated Product product){
        return productService.add(product);
    }
    @GetMapping("/getAllProducts")
    public List<Product> getAll(){
       return productService.getAll();
    }

    @GetMapping("/product/category/{id}")
    public List<Product> getByCategory(@PathVariable long id){
        return productService.getByCategoryId(id);
    }
}
