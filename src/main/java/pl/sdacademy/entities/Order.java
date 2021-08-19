package pl.sdacademy.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private User user;
    private double totalPrice;
    private String deliveryAddress;
    private String userAddress;
    @OneToOne
    private OrderLine orderLine;
    private Date dateOfOrder;
    private StatusOfTheOrder statusOfTheOrder;



}

