package com.startup.realtor.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Company extends AbstractBaseEntity {

    @ManyToOne
    private Realtor realtor;
}
