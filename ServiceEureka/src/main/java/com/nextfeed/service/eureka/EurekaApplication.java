package com.nextfeed.service.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication(scanBasePackages = "com.nextfeed.service.eureka")
public class EurekaApplication {

	public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
	}

}
