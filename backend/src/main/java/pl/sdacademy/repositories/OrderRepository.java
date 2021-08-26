package pl.sdacademy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sdacademy.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
