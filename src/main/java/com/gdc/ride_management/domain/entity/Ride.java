package com.gdc.ride_management.domain.entity;


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
@Table(name = "rides", schema = "ridedata")
public class Ride {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID rideId;

    @Column(nullable = false)
    private UUID driverId; // References users.id from userdata schema

    @Column(nullable = false)
    private String departureLocation;

    @Column(nullable = false)
    private String destinationLocation;

    @Column(nullable = false)
    private int availableSpace;

    @Column(nullable = false)
    private LocalDateTime departureTime;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();
}
