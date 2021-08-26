package pl.sdacademy.services;

import org.springframework.stereotype.Service;
import pl.sdacademy.entities.Order;
import pl.sdacademy.repositories.OrderRepository;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order save(Order order){
        return orderRepository.save(order);
    }

    public List<Order> getAll(){
        return orderRepository.findAll();
    }

    public Order getById(long id){
        return orderRepository.findById(id).orElseThrow();
    }
}
