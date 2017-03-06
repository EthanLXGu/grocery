package com.ethan.domain;

import javax.persistence.*;

/**
 * Created by lingxingu on 2017/2/27.
 */
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue
    public Long id;

    @Column(name = "name")
    public String name;

    @Column(name = "price")
    public Float price;

    @Column(name = "in_stock")
    public Boolean inStock;

    @Column(name = "comments")
    public String comment;

    public Product(String name, Float price, Boolean inStock, String comment) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
        this.comment = comment;
    }

    public Product() {
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

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Boolean getInStock() {
        return inStock;
    }

    public void setInStock(Boolean inStock) {
        this.inStock = inStock;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}
