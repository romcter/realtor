package com.startup.realtor.entity;

import com.startup.syncdto.enums.City;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@Entity
public class Address {

    @Id
    private Long id;
    private String street;
    private Long numberHouse;
    private City city;

    @OneToOne
    private Advertisement advertisement;
}
