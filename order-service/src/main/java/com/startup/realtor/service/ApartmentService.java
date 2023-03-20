package com.startup.realtor.service;

import com.startup.realtor.repository.ApartmentRepository;
import org.springframework.stereotype.Service;

@Service
public class ApartmentService {

    private final ApartmentRepository apartmentRepository;

    public ApartmentService(ApartmentRepository apartmentRepository) {
        this.apartmentRepository = apartmentRepository;
    }
}
