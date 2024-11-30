package com.healthsync.daar_service.controller;

import com.healthsync.daar_service.entity.AggregatedMetrics;
import com.healthsync.daar_service.service.AggregationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/aggregation")
public class AggregationController {

    private final AggregationService aggregationService;

    public AggregationController(AggregationService aggregationService) {
        this.aggregationService = aggregationService;
    }

    @PostMapping("/appointments-per-doctor")
    public ResponseEntity<AggregatedMetrics> aggregateAppointmentsPerDoctor() {
        return ResponseEntity.ok(aggregationService.aggregateAppointmentsPerDoctor());
    }

    @PostMapping("/common-symptoms")
    public ResponseEntity<AggregatedMetrics> aggregateCommonSymptoms() {
        return ResponseEntity.ok(aggregationService.aggregateCommonSymptoms());
    }
}