package com.example.les_12_televisions_services.module;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "CiModules")

public class CiModule {


    @Id
    @GeneratedValue

    public Long id;
    private String name;
    public String type;
    private double price;

@OneToMany(mappedBy = "ciModule")
private List <TelevisionsCiModules>televisionsCiModules;

    public List<TelevisionsCiModules> getTelevisionsCiModules() {
        return televisionsCiModules;
    }

    public void setTelevisionsCiModules(List<TelevisionsCiModules> televisionsCiModules) {
        this.televisionsCiModules = televisionsCiModules;
    }

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