package pl.sdacademy.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(max = 30, message = "Typ może mieć maksymalnie {max} liter")
    @NotEmpty
    private String type;
    @Size(max = 30, message = "Tytuł może mieć maksymalnie {max} liter")
    @NotEmpty
    private String title;
    @Size(max = 245, message = "Opis może mieć maksymalnie {max} liter")
    @NotEmpty
    private String description;
    @Pattern(regexp = "[1-10000]",message = "Cena może mieć wartość w zakresie {regexp}")
    @NotEmpty
    private String price;
    @Size(max= 30, message = "Marka nie może mieć więcej niż {max} liter")
    @NotEmpty
    private String brand;
    @Pattern(regexp = "[0-50]", message = "Rozmiar może mieć wartość z zakresu {regexp}")
    @NotEmpty
    private String size;
    @Size(max=30, message = "Marka nie może mieć więcej niż {max} liter")
    private String category;

    public Product() {
    }

    public Product(String type, String title, String description, String price, String brand, String size, String category, String photoUrl) {
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

    public String getPrice() {
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

    public void setPrice(String  price) {
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
