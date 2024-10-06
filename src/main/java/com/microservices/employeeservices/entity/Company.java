package com.microservices.employeeservices.entity;

import jakarta.persistence.*;

@Entity
@Table(name="company")
public class Company {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @OneToOne
    @Column(name="employeeId")
    private int employeeId;



}
