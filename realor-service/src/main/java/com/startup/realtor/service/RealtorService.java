package com.startup.realtor.service;

import com.startup.realtor.mapper.RealtorMapper;
import com.startup.realtor.repository.RealtorRepository;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
public class RealtorService {

    private final RealtorRepository realtorRepository;
    private final RealtorMapper realtorMapper;

    public RealtorService(RealtorRepository realtorRepository) {
        this.realtorRepository = realtorRepository;
    }

    public RealtorDto getRealtor(Long realtorId){
        return realtorRepository.findById(realtorId)
                .orElseThrow(() -> new NotFoundException(format(ORDER_NOT_FOUND, realtorId)));
    }
}
