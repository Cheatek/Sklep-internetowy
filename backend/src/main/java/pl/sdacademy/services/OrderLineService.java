package pl.sdacademy.services;

import org.springframework.stereotype.Service;
import pl.sdacademy.entities.OrderLine;
import pl.sdacademy.entities.Product;
import pl.sdacademy.repositories.OrderLineRepository;

import java.util.List;

@Service
public class OrderLineService {
    private OrderLineRepository orderLineRepository;

    public OrderLineService(OrderLineRepository orderLineRepository) {
        this.orderLineRepository = orderLineRepository;
    }

    public OrderLine getById(long id){
        return orderLineRepository.getById(id);
    }
    public OrderLine save(OrderLine orderLine){
        return orderLineRepository.save(orderLine);
    }
    public List<OrderLine> getAll(){
        return orderLineRepository.findAll();
    }
}
