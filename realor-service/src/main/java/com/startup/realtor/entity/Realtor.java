package com.startup.realtor.entity;

import com.startup.syncdto.enums.AuthorityEnum;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Realtor extends AbstractBaseEntity {

    private String name;
    private String LastName;

    @OneToOne(fetch = FetchType.LAZY)
    private Company company;

    @Enumerated(EnumType.STRING)
    private AuthorityEnum authorityRole;
}
