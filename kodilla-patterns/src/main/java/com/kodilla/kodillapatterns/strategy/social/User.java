package com.kodilla.kodillapatterns.strategy.social;

public class User {
    final private String name;
    protected SocialPublisher socialPublisher;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String sharePost() {
        return socialPublisher.share();
    }

    public void selectSocial(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
