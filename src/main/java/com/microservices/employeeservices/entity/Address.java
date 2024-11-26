package com.microservices.employeeservices.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "city")
    private String city;

    @Column(name = "district")
    private String district;

    @OneToOne
    @Column(name = "pincode")
    private String pincode;


}
