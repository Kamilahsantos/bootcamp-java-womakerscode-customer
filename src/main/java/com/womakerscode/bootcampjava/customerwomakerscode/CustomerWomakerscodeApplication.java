package com.womakerscode.bootcampjava.customerwomakerscode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CustomerWomakerscodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerWomakerscodeApplication.class, args);
	}

}
