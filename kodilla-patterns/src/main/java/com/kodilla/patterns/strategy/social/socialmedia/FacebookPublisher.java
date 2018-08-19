package com.kodilla.patterns.strategy.social.socialmedia;

public class FacebookPublisher implements SocialPublisher {

    @Override
    public String share() {
        return "Udostępnianie przez Facebook";
    }
}