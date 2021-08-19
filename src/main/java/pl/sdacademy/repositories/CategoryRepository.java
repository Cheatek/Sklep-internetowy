package pl.sdacademy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sdacademy.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
