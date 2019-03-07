package com.zeeshan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.zeeshan.dao.ProfileRepository;
import com.zeeshan.dao.RemoteProfileRepository;

@SpringBootApplication
@EnableEurekaClient
public class ProfileConsumerServiceApplication {

	public static final String PROFILES_SERVICE_URL = "http://PROFILE-PRODUCER-SERVICE";

	public static void main(String[] args) {
		SpringApplication.run(ProfileConsumerServiceApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean
	public ProfileRepository profileRepository() {
		return new RemoteProfileRepository(PROFILES_SERVICE_URL);
	}
}
