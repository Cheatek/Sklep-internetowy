package pl.sdacademy.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(max = 15, message = "Typ może mieć maksymalnie {max} liter")
    @NotEmpty(message = "Pole nie może być puste")
    private String type;
    @Size(max = 20, message = "Tytuł może mieć maksymalnie {max} liter")
    @NotEmpty(message = "Pole nie może być puste")
    private String title;
    @Size(max = 100, message = "Opis może mieć maksymalnie {max} liter")
    @NotEmpty(message = "Pole nie może być puste")
    private String description;
    @Max(value = 10000,message = "Cena może mieć maksymalną wartość {value}")
    @Min(value = 1,message = "Minimalna wartość wynosi 1")
    @NotNull
    private BigDecimal price;
    @Size(max= 20, message = "Marka nie może mieć więcej niż {max} liter")
    @NotNull(message = "Pole nie może być puste")
    private String brand;
    @NotEmpty
    private String size;
    @Size(max=20, message = "Marka nie może mieć więcej niż {max} liter")
    @NotNull(message = "Pole nie może być puste")
    private String category;

    public Product() {
    }

    public Product(String type, String title, String description, BigDecimal price, String brand, String size, String category, String photoUrl) {
        this.type = type;
        this.title = title;
        this.description = description;
        this.price = price;
        this.brand = brand;
        this.size = size;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getSize() {
        return size;
    }

    public String getCategory() {
        return category;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(BigDecimal  price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setCategory(String category) {
        this.category = category;
    }


}
