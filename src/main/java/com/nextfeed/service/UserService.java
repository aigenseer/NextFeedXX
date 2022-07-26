package com.nextfeed.service;

import com.nextfeed.dto.User;
import org.springframework.stereotype.Service;

@Service
public class UserService extends DefaultService {

    UserService(){
        super(8020);
    }

    public User getUser(){
        return (User) get(User.class, "/user");
    }

}
