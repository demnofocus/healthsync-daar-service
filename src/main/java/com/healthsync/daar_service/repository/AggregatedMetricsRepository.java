package com.healthsync.daar_service.repository;

import com.healthsync.daar_service.entity.AggregatedMetrics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AggregatedMetricsRepository extends JpaRepository<AggregatedMetrics, Long> {
}