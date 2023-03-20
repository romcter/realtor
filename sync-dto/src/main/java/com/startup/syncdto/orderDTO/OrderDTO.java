package com.startup.syncdto.orderDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NonNull;


@Data
public class OrderDTO {

    @NonNull
    @JsonIgnore
    private Long id;

    private String description;
    private Integer price;

    private ApartmentDTO apartment;
}
