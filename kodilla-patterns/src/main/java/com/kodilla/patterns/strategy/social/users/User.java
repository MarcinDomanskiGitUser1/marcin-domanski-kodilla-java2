package com.kodilla.patterns.strategy.social.users;

import com.kodilla.patterns.strategy.social.socialmedia.SocialPublisher;

public class User {

    final private String userName;
    protected SocialPublisher socialPublisher;


    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String sharePost(){
        return socialPublisher.share();
    }

    public void setSocialNetwork(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
