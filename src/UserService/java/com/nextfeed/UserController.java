package com.nextfeed;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final SurveyService surveyService;

    @GetMapping("/user/create")
    public UserRequest create() {
        surveyService.create();
        System.out.println("yes");
        return new UserRequest("TestUser");
    }

}
