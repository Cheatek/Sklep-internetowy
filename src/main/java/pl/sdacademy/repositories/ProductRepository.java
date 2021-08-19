package pl.sdacademy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sdacademy.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
