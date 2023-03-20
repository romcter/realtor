package com.startup.realtor.mapper;

import com.startup.realtor.entity.Order;
import com.startup.syncdto.orderDTO.OrderDTO;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        componentModel = "spring")
public interface OrderMapper {
    OrderDTO entityToDto(Order order);
    Order dtoToEntity(OrderDTO orderDTO);
}
