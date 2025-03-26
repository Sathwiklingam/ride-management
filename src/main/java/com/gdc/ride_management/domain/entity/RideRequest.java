package com.gdc.ride_management.domain.entity;


import com.gdc.ride_management.domain.enums.RequestStatus;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "ride_requests", schema = "ridedata")
public class RideRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID requestId;

    @Column(nullable = false)
    private UUID rideId; // References rides.ride_id

    @Column(nullable = false)
    private UUID userId; // References users.id from userdata schema

    @Column(nullable = false)
    private String goodsDescription;

    @Column(nullable = false)
    private int requestedSpace;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private RequestStatus status = RequestStatus.PENDING;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();
}


