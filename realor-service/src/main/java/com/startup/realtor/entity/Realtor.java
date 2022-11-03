package com.startup.realtor.entity;

import com.startup.realtor.enums.AuthorityEnum;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Builder
public class Realtor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String LastName;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id", nullable = false)
    private Company company;

    @Enumerated(EnumType.STRING)
    private AuthorityEnum authorityRole;

    public Realtor() {

    }
}
