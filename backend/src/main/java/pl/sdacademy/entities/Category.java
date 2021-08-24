package pl.sdacademy.entities;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(max = 20, message = "Nazwa może posiadać maksymalnie {max} liter")
    @NotEmpty
    private String name;
    @Size(max = 30, message = "Producent może posiadać maksymalnie {max} liter")
    @NotEmpty
    private String producent;

    public Category() {
    }

    public Category(Long id, String name, String producent) {
        this.id = id;
        this.name = name;
        this.producent = producent;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getProducent() {
        return producent;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", producent='" + producent + '\'' +
                '}';
    }
}
