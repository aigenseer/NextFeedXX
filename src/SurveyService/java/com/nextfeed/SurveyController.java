package com.nextfeed;

import com.nextfeed.lib.TestLib;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SurveyController {

    private final TestLib testLib;

    @GetMapping("/survey/test")
    public TestRequest create() {
        System.out.println("yes geht");
        return new TestRequest("Test");
    }

}
