package com.nextfeed;

import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@EnableDiscoveryClient
@SpringBootApplication
@PropertySource({ "classpath:survey.application.properties" })
public class SurveyApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}

    @AllArgsConstructor
    @RestController
    static
    class ServiceInstanceRestController {

        private DiscoveryClient discoveryClient;

        @RequestMapping("/service-instances/{applicationName}")
        public List<ServiceInstance> serviceInstancesByApplicationName(@PathVariable String applicationName) {
            return this.discoveryClient.getInstances(applicationName);
        }
    }

}
