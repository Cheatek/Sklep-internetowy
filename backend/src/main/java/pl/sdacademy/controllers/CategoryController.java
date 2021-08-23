package pl.sdacademy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.sdacademy.entities.Category;
import pl.sdacademy.services.CategoryService;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200/")
public class CategoryController {
    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/category/id/{id}")
    public Category getById(@PathVariable long id) {
        return categoryService.getById(id);
    }
    @PostMapping("/addCategory")
    public void add(@RequestBody Category category){
        categoryService.add(category);
    }
    @GetMapping("/getAllCategories")
    public List<Category> getAll(){
       return categoryService.getAll();
    }
}
