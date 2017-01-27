package com.bearbig.spring.cloud.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudConsulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConsulServerApplication.class, args);
	}
}
