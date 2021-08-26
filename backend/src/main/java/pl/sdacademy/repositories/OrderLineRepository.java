package pl.sdacademy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sdacademy.entities.OrderLine;

public interface OrderLineRepository extends JpaRepository<OrderLine,Long> {
}
