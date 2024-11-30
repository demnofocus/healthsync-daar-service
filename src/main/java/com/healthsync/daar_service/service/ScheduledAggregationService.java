package com.healthsync.daar_service.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledAggregationService {

    private final AggregationService aggregationService;

    public ScheduledAggregationService(AggregationService aggregationService) {
        this.aggregationService = aggregationService;
    }

    @Scheduled(cron = "0 0 * * * ?") // Every hour
    public void aggregateMetricsHourly() {
        aggregationService.aggregateAppointmentsPerDoctor();
        aggregationService.aggregateCommonSymptoms();
    }
}