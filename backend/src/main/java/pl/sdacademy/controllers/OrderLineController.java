package pl.sdacademy.controllers;

import org.springframework.web.bind.annotation.*;
import pl.sdacademy.entities.OrderLine;
import pl.sdacademy.services.OrderLineService;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200/")
public class OrderLineController {
    private OrderLineService orderLineService;

    public OrderLineController(OrderLineService orderLineService) {
        this.orderLineService = orderLineService;
    }
    @GetMapping("/orderLine/{id}")
    public OrderLine getById(@PathVariable long id){
        return orderLineService.getById(id);
    }
    @PostMapping("add-orderline")
    public OrderLine save(@RequestBody OrderLine orderLine){
        return orderLineService.save(orderLine);
    }
    @GetMapping("/getAll")
    public List<OrderLine> getAll(){
        return orderLineService.getAll();
    }



}
