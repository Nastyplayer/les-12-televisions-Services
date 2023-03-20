package com.example.les_12_televisions_services.dto;

import com.example.les_12_televisions_services.module.Television;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

public class RemoteControllerOutputDto {
    @Id
    @GeneratedValue

    public Long id;
    public String compatibleWith;
    private String batteryType;
    private String name;
    private String brand;
    private Double price;
    private Integer originalStock;

    @OneToOne( mappedBy= "remoteController")
    private Television television;



}



