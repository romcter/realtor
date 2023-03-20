package com.startup.syncdto.orderDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.startup.syncdto.enums.City;
import lombok.Data;
import lombok.NonNull;

@Data
public class AddressDTO {

    @NonNull
    @JsonIgnore
    private Long id;

    private String street;
    private Long numberHouse;
    private City city;

    private ApartmentDTO apartment;
}
