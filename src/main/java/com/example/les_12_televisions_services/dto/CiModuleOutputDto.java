package com.example.les_12_televisions_services.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class CiModuleOutputDto {


    @Id
    @GeneratedValue

    public Long id;
    private String name;
    public String type;
    private double price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
