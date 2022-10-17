package com.juliancastillo.alquilerComputadores.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import javax.persistence.Entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Entity
@Table(name="computer")
public class Computer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String brand;
    private Integer model;
    private Category categoryId;

    /**
     *
     * @param id
     * @param name
     * @param brand
     * @param model
     * @param categoryId
     */
    public Computer(Integer id, String name, String brand, Integer model, Category categoryId){
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.model = model;
    }

    @ManyToOne
    @JoinColumn(name = "categoryId")
    @JsonIgnoreProperties("computer")
    private Category category;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getModel() {
        return model;
    }

    public void setModel(Integer model) {
        this.model = model;
    }

}
