package com.example.les_12_televisions_services.module;

import jakarta.persistence.*;


@Entity

    public class TelevisionsCiModules {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(nullable = false)
    private CiModule ciModule;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Television television;


}
