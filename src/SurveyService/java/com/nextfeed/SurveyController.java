package com.nextfeed;

import com.nextfeed.dto.User;
import com.nextfeed.lib.TestLib;
import com.nextfeed.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SurveyController {

    private final TestLib testLib;
    private final UserService userService;

    @GetMapping("/test")
    public TestRequest test() {
        User user = userService.getUser();
        System.out.println(user.name());
        return new TestRequest("Test");
    }

}
