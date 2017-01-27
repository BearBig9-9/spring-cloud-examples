package com.bearbig.spring.cloud.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringCloudEurekaRegisterCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaRegisterCenterApplication.class, args);
	}
}
