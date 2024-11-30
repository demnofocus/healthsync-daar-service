package com.healthsync.daar_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class HealthSyncDAARServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthSyncDAARServiceApplication.class, args);
	}

}
