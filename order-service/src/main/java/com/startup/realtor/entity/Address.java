package com.startup.realtor.entity;

import com.startup.syncdto.enums.City;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Address extends AbstractBaseEntity {

    private String street;
    private Long numberHouse;
    private City city;

    @OneToOne(mappedBy = "address")
    private Apartment apartment;
}
