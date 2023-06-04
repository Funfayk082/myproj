package com.example.myproj.models;

import jakarta.persistence.*;

@Entity
public class Promo {
    @Id
    @SequenceGenerator(name="promo_sequence", sequenceName = "promo_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "promo_sequence")
    private long Id;

}
