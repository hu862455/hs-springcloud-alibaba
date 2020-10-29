package org.example.hsconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HsConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HsConsumerApplication.class, args);
	}

}
