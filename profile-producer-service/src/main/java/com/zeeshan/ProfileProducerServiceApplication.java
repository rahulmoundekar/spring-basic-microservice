package com.zeeshan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProfileProducerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfileProducerServiceApplication.class, args);
	}

}
