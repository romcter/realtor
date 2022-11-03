package com.startup.realtor.entity;

import javax.persistence.*;

@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @JoinColumn
    @ManyToOne
    private Realtor realtor;
}
