package com.startup.realtor.entity;

import lombok.Data;
import javax.persistence.*;


@Data
@Entity
public class BaseOrder {

    @Id
    private Long id;
    private String description;

    @OneToOne
    private Address address;
}
