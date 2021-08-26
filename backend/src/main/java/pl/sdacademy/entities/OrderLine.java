package pl.sdacademy.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class OrderLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Product product;
    private int numberOfProducts;
    private BigDecimal price;

    public OrderLine() {
    }

    public OrderLine(Long id, Product product, int numberOfProducts, BigDecimal price) {
        this.id = id;
        this.product = product;
        this.numberOfProducts = numberOfProducts;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public Product getProduct() {
        return product;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public BigDecimal getPrice() {
        return price;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderLine{" +
                "id=" + id +
                ", product=" + product +
                ", numberOfProducts=" + numberOfProducts +
                ", price=" + price +
                '}';
    }
}


