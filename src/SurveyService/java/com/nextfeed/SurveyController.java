package com.nextfeed;

import com.nextfeed.lib.TestLib;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/survey", produces = MediaType.APPLICATION_JSON_VALUE)
public class SurveyController {

    private DiscoveryClient discoveryClient;
    private ClientConfig config;

    @GetMapping
    public String load() {
        return String.format(config.getMessage(), "", "");
    }

    @GetMapping("/test")
    public TestRequest create() {
        System.out.println("yes geht");
        return new TestRequest("Test");
    }

}
