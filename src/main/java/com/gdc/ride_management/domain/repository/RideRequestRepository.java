package com.gdc.ride_management.domain.repository;

import com.gdc.ride_management.domain.entity.RideRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.UUID;

public interface RideRequestRepository extends JpaRepository<RideRequest, UUID> {
    List<RideRequest> findByRideId(UUID rideId);
    List<RideRequest> findByUserId(UUID userId);
}
