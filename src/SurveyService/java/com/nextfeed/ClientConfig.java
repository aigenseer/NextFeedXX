package com.nextfeed;


import lombok.Data;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "bean")
@Getter
public class ClientConfig {

    private String message = "Message from backend is: %s <br/> Services : %s";
}
