package com.kodilla.kodillapatterns.strategy.social;

public class SnapchatPublisher implements SocialPublisher{
    @Override
    public String share() {
        return "Snapchat";
    }
}
