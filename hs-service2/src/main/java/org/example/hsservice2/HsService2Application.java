package org.example.hsservice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HsService2Application {

	public static void main(String[] args) {
		SpringApplication.run(HsService2Application.class, args);
	}

}
