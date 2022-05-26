package com.terracare.gardenmanagementserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.*;

@SpringBootApplication
public class GardenManagementServerApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(GardenManagementServerApplication.class);
	
	public static void main(String[] args) {
		
		logger.info("Starting server...");

		SpringApplication.run(GardenManagementServerApplication.class, args);
	}

}
