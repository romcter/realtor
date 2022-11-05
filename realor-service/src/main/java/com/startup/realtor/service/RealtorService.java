package com.startup.realtor.service;

import com.startup.realtor.NotFoundException;
import com.startup.realtor.mapper.RealtorMapper;
import com.startup.realtor.repository.RealtorRepository;
import com.startup.syncdto.realtor.RealtorDto;
import org.springframework.stereotype.Service;

import static com.startup.realtor.config.IntegrationConstraint.REALTOR_NOT_FOUND;
import static java.lang.String.format;

@Service
public class RealtorService {

    private final RealtorRepository realtorRepository;
    private final RealtorMapper realtorMapper;

    public RealtorService(RealtorRepository realtorRepository, RealtorMapper realtorMapper) {
        this.realtorRepository = realtorRepository;
        this.realtorMapper = realtorMapper;
    }

    public RealtorDto findRealtor(Long realtorId) {
        return realtorMapper.entityToDto(
                realtorRepository.findById(realtorId)
                        .orElseThrow(() -> new NotFoundException(format(REALTOR_NOT_FOUND, realtorId))));
    }
}
