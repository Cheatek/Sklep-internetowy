package pl.sdacademy.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "`Order`")
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
    @OneToMany
    private Set<OrderLine> orderLine;

    public Order(){}

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Date getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(Date dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    public StatusOfTheOrder getStatusOfTheOrder() {
        return statusOfTheOrder;
    }

    public void setStatusOfTheOrder(StatusOfTheOrder statusOfTheOrder) {
        this.statusOfTheOrder = statusOfTheOrder;
    }
}
