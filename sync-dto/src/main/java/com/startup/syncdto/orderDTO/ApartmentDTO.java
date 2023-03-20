package com.startup.syncdto.orderDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NonNull;

@Data
public class ApartmentDTO {

    @NonNull
    @JsonIgnore
    private Long id;

    private Integer price;
    private Integer floor;
    private Integer rooms;

    private AddressDTO address;

    private OrderDTO order;

}
