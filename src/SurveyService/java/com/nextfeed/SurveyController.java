package com.nextfeed;

import com.nextfeed.lib.TestLib;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SurveyController {

    private final TestLib testLib;

    @GetMapping("/test")
    public TestRequest adminAuth() {
        testLib.test();
        return new TestRequest("TestName");
    }

}
