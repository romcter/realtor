package com.startup.realtor.mapper;

import com.startup.realtor.entity.Address;
import com.startup.syncdto.orderDTO.AddressDTO;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        componentModel = "spring")
public interface AddressMapper {

    AddressDTO entityToDto(Address address);

    Address dtoToEntity(AddressDTO addressDTO);
}
