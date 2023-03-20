package com.startup.realtor.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Order extends AbstractBaseEntity {

    private String description;
    private Integer price;

    @OneToOne
    @JoinColumn(name = "apartment_id")
    private Apartment apartment;

}
