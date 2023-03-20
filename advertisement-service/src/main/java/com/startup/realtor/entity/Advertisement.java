package com.startup.realtor.entity;

import com.startup.syncdto.enums.advertisement.AdvertisementTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Advertisement extends AbstractBaseEntity {

    private String description;

    @OneToOne
    private Address address;

    private AdvertisementTypeEnum advertisementType;
}
