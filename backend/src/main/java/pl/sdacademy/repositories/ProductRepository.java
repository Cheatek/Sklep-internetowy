package pl.sdacademy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pl.sdacademy.entities.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
 //   @Query("select p from Product p where p.category.id = :id")
    List<Product> getProductsByCategory_Id(Long id);
}
