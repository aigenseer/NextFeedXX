package com.nextfeed;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "survey-service")
public interface SurveyService {

    @RequestMapping("/survey/test")
    public TestRequest create();

}