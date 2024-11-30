package com.healthsync.daar_service.service;

import com.healthsync.daar_service.entity.AggregatedMetrics;
import com.healthsync.daar_service.repository.AggregatedMetricsRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Service
public class AggregationService {

    private final AggregatedMetricsRepository metricsRepository;

    public AggregationService(AggregatedMetricsRepository metricsRepository) {
        this.metricsRepository = metricsRepository;
    }

    // Aggregate appointments per doctor
    public AggregatedMetrics aggregateAppointmentsPerDoctor() {
        // Simulated data (replace with actual database queries)
        Map<String, Integer> appointmentsPerDoctor = new HashMap<>();
        appointmentsPerDoctor.put("Dr. A", 12);
        appointmentsPerDoctor.put("Dr. B", 8);

        String metricValue = appointmentsPerDoctor.toString();

        AggregatedMetrics metric = new AggregatedMetrics(null, "Appointments Per Doctor", metricValue, LocalDateTime.now());
        return metricsRepository.save(metric);
    }

    // Aggregate most common symptoms
    public AggregatedMetrics aggregateCommonSymptoms() {
        // Simulated data (replace with actual database queries)
        Map<String, Integer> commonSymptoms = new HashMap<>();
        commonSymptoms.put("Fever", 40);
        commonSymptoms.put("Cough", 25);

        String metricValue = commonSymptoms.toString();

        AggregatedMetrics metric = new AggregatedMetrics(null, "Most Common Symptoms", metricValue, LocalDateTime.now());
        return metricsRepository.save(metric);
    }
}