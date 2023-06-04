package com.example.myproj.models;

import jakarta.persistence.*;

@Entity
public class Product {

    @Id
    @SequenceGenerator(name = "product_sequnce", sequenceName = "product_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_sequence")
    private Long id;
    private String title;
    private String description;

    private String price;
    private String photo;

    public Product(Long id, String title, String description, String price, String photo) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.photo = photo;
    }

    public Product() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
