package pl.sdacademy.controllers;

import org.springframework.web.bind.annotation.*;
import pl.sdacademy.entities.Order;
import pl.sdacademy.services.OrderService;

import java.util.List;

@CrossOrigin("http://localhost:4200/")
@RestController
public class OrderController {
    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/order")
    public List<Order> getAllOrders(){
        return orderService.getAll();
    }

    @PostMapping("/order")
    public Order addOrder(@RequestBody Order order){
        return orderService.save(order);
    }

    @GetMapping("/order/id/{id}")
    public Order getOrderById(long id){
        return orderService.getById(id);
    }
}
