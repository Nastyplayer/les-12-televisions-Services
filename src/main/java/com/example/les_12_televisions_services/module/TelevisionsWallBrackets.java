package com.example.les_12_televisions_services.module;


import jakarta.persistence.*;

@Entity
public class TelevisionsWallBrackets {

   @Id
   @GeneratedValue
   private Long id;
   @ManyToOne
   @JoinColumn(nullable = false)
   private WallBracket wallBracket;

   @ManyToOne
   @JoinColumn(nullable = false)
    private Television television;


}
