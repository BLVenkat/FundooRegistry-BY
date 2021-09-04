package com.bridgelabz.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FundooRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(FundooRegistryApplication.class, args);
	}

}
