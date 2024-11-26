package com.microservices.employeeservices.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "pincode")
public class Pincode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "pincode")
    private String pincode;

    @Column(name = "city")
    private String city;

    @Column(name = "area")
    private String area;

    @Column(name = "state")
    private String state;

    @Column(name = "district")
    private String district;


}
