package com.startup.realtor.mapper;

import com.startup.realtor.entity.Apartment;
import com.startup.syncdto.orderDTO.ApartmentDTO;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        componentModel = "spring")
public interface ApartmentMapper {

    ApartmentDTO entityToDto(Apartment apartment);

    Apartment dtoToEntity(ApartmentDTO apartmentDTO);
}
