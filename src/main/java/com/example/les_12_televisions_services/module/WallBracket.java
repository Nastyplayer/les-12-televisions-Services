package com.example.les_12_televisions_services.module;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "WallBracket")

public class WallBracket {

    @Id
    @GeneratedValue

    public Long id;

    public String name;
    private Double price;
    private String size;
    private Boolean ajustable;

    @ManyToMany(mappedBy = "wallBrackets")
    private List<Television> television;


    @OneToMany(mappedBy = "wallBracket")
    private List<TelevisionsWallBrackets>televisionsWallBrackets;


    public List<Television> getTelevision() {
        return television;
    }

    public void setTelevision(List<Television> television) {
        this.television = television;
    }

    public List<TelevisionsWallBrackets> getTelevisionsWallBrackets() {
        return televisionsWallBrackets;
    }

    public void setTelevisionsWallBrackets(List<TelevisionsWallBrackets> televisionsWallBrackets) {
        this.televisionsWallBrackets = televisionsWallBrackets;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Boolean getAjustable() {
        return ajustable;
    }

    public void setAjustable(Boolean ajustable) {
        this.ajustable = ajustable;
    }


}
