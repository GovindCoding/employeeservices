package com.microservices.employeeservices.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "countryname")
    private String countryName;

    @Column(name = "countryinitials")
    private String countryInitials;

}
