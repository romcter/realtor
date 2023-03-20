package com.startup.realtor.entity;

import javax.persistence.*;

@MappedSuperclass
public abstract class AbstractBaseEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}