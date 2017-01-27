package com.bearbig.spring.cloud.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudEurekaClient2FeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaClient2FeignApplication.class, args);
	}
}
