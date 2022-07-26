package com.nextfeed;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    @GetMapping("/user")
    public UserRequest adminAuth() {
        return new UserRequest("TestUser");
    }

}
