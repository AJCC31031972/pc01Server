package org.cjava.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TestcjavaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestcjavaServerApplication.class, args);
	}
}
