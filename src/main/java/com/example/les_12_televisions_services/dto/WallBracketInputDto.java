package com.example.les_12_televisions_services.dto;

import com.example.les_12_televisions_services.module.Television;
import com.example.les_12_televisions_services.module.TelevisionsWallBrackets;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

import java.util.List;

public class WallBracketInputDto {


    @Id
    @GeneratedValue

    public Long id;

    public String name;
    private Double price;
    private String size;
    private Boolean ajustable;

}


