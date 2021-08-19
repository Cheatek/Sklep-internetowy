package pl.sdacademy.controllers;

import org.springframework.web.bind.annotation.*;
import pl.sdacademy.entities.Category;
import pl.sdacademy.repositories.CategoryRepository;

import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/controller")
public class CategoryController {
    private CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @GetMapping
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @GetMapping("/{id}")
    public Category getById(@PathVariable Long id) {
        return categoryRepository.findById(id)
                .orElseThrow();
    }

    @PostMapping
    public Category create(@RequestBody Category category) {
        return categoryRepository.save(category);
    }
}
