package com.kodilla.kodillapatterns.strategy.social;

public class Millenials extends User {
    public Millenials(String name) {
        super(name);
        this.socialPublisher = new FacebookPublisher();
    }
}
