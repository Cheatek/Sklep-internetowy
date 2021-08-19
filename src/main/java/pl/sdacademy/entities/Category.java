package pl.sdacademy.entities;


import javax.persistence.*;


@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String producent;

}
