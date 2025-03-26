package com.gdc.ride_management.domain.repository;


import com.gdc.ride_management.domain.entity.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.UUID;

public interface RideRepository extends JpaRepository<Ride, UUID> {
    List<Ride> findByAvailableSpaceGreaterThan(int space);
}
