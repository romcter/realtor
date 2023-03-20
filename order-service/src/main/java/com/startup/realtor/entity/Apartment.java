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
public class Apartment extends AbstractBaseEntity {

    private Integer price;
    private Integer floor;
    private Integer rooms;

    @OneToOne
    @JoinColumn(name = "adress_id")
    private Address address;

    @OneToOne(mappedBy = "apartment")
    private Order order;

}
