package com.kodilla.patterns.strategy.social.socialmedia;

public class TwitterPublisher implements SocialPublisher {

    @Override
    public String share() {
        return "Udostępnianie przez Twitter";
    }
}
