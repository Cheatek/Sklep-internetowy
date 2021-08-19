package pl.sdacademy.entities;


import javax.persistence.*;


@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String producent;

    public Category() {
    }

    public Category(Integer id, String name, String producent) {
        this.id = id;
        this.name = name;
        this.producent = producent;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getProducent() {
        return producent;
    }

    public void setId(Integer id) {
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
