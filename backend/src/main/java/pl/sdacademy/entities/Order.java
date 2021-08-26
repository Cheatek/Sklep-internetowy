package pl.sdacademy.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private User user;
    private BigDecimal totalPrice;
    @Embedded
    private Address deliveryAddress;
    private Date dateOfOrder;
    private StatusOfTheOrder statusOfTheOrder;

    public Order(){}
}
