package com.example.les_12_televisions_services.module;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.*;


@Entity
@Table( name = "RemoteController")

public class RemoteController {

    @Id
    @GeneratedValue

    private Long id;
    private String compatibleWith;
    private  String batteryType;
    private  String name;
    private  String brand;
    private  Double price;
    private Integer originalStock;

    @OneToOne( mappedBy= "remoteController")

    private static Television television;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompatibleWith() {
        return compatibleWith;
    }

    public void setCompatibleWith(String compatibleWith) {
        this.compatibleWith = compatibleWith;
    }

    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getOriginalStock() {
        return originalStock;
    }

    public void setOriginalStock(Integer originalStock) {
        this.originalStock = originalStock;
    }

    public static Television getTelevision() {
        return television;
    }

    public static void setTelevision(Television television) {
        RemoteController.television = television;
    }
}
