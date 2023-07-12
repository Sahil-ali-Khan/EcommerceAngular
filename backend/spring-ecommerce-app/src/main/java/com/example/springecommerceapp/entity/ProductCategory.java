package com.example.springecommerceapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "product_category")
@Getter
@Setter
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long  id;

    @Column(name = "category")
    private String category;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "category")
    private Set<Product> products;
}
