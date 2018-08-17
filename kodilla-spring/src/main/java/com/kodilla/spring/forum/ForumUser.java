package com.kodilla.spring.forum;

import  org.springframework.stereotype.Component;

@Component
public class ForumUser {

    private String userName;

    public ForumUser () {
        userName = "John Wielebny Smith";
    }

    public String getUserName() {
        return userName;
    }
}
