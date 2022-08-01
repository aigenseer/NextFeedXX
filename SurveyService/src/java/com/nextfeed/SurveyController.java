package com.nextfeed;


import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/survey", produces = MediaType.APPLICATION_JSON_VALUE)
public class SurveyController implements SurveyService {

    private final String uniqueID = UUID.randomUUID().toString();

    @GetMapping("/test")
    public TestRequest create() {
        System.out.println("yes geht " +uniqueID);
        return new TestRequest("Test");
    }

}
