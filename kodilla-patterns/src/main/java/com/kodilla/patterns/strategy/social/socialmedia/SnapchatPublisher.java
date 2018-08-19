package com.kodilla.patterns.strategy.social.socialmedia;

public class SnapchatPublisher implements SocialPublisher {

    @Override
    public String share() {
        return "Udostępnianie przez Snapchat";
    }
}
