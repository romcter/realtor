package com.startup.realtor.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Company {

    @Id
    private Long id;
    private String name;

    @ManyToOne
    private Realtor realtor;
}
