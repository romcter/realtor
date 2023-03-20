package com.startup.realtor.mapper;

import com.startup.realtor.entity.Company;
import com.startup.realtor.entity.Realtor;
import com.startup.syncdto.enums.AuthorityEnum;
import com.startup.syncdto.realtorDTO.RealtorDto;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        componentModel = "spring",
        imports = {Company.class, AuthorityEnum.class}
)
public interface RealtorMapper {

    Realtor dtoToEntity(RealtorDto realtorDto);
    RealtorDto entityToDto(Realtor realtorDto);
}
