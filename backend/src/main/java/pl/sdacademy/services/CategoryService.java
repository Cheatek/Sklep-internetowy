package pl.sdacademy.services;

import org.springframework.stereotype.Service;
import pl.sdacademy.entities.Category;
import pl.sdacademy.repositories.CategoryRepository;

import java.util.List;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category add(Category category){
        return categoryRepository.save(category);
    }
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }
    public Category getById(long id){
        return categoryRepository.getById(id);
    }
    public Category getByName(String name){
        return categoryRepository.getCategoryByName(name).orElse(null);
    }
}
