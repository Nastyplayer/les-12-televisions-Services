package com.example.les_12_televisions_services.module;

import jakarta.persistence.*;


@Entity

    public class TelevisionsCiModules {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @Column(nullable = false)
    private CiModule ciModule;

    @ManyToOne
    @Column(nullable = false)
    private Television television;


}
