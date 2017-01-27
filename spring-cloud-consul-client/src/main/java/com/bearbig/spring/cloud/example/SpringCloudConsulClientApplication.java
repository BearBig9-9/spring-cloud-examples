package com.bearbig.spring.cloud.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudConsulClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConsulClientApplication.class, args);
	}
}
