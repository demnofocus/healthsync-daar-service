package com.healthsync.daar_service.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "aggregated_metrics")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AggregatedMetrics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String metricName; // E.g., "Appointments Per Doctor"

    @Column(nullable = false)
    private String metricValue; // JSON or plain text

    @Column(nullable = false)
    private LocalDateTime timestamp; // Time the metric was generated
}

