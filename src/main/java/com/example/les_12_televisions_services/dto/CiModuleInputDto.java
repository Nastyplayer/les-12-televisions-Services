package com.example.les_12_televisions_services.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;



public class CiModuleInputDto {


    @Id
    @GeneratedValue

    public Long id;
    private String name;
    public String type;
    private double price;





}




