package pl.sdacademy.services;

import org.springframework.stereotype.Service;
import pl.sdacademy.entities.Product;
import pl.sdacademy.repositories.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product add(Product product){
        return productRepository.save(product);
    }
    public List<Product> getAll() {
        return productRepository.findAll();
    }
    public Product getById(long id){
        return productRepository.getById(id);
    }

    public List<Product> getByCategoryId(Long id){
        return productRepository.getProductsByCategory_Id(id);
    }
}
