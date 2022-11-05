package com.startup.realtor.entity;

import com.startup.syncdto.enums.AuthorityEnum;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Realtor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String LastName;

    @OneToOne(fetch = FetchType.LAZY)
    private Company company;

    @Enumerated(EnumType.STRING)
    private AuthorityEnum authorityRole;

    public Realtor() {

    }
}
