package com.startup.realtor.repository;

import com.startup.realtor.entity.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApartmentRepository extends JpaRepository<Apartment,Long> {
}
