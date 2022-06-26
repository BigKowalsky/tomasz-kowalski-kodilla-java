package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    int userNumber;
    int postsNumber;
    int commentsNumber;

    public void calculateAdvStatistics(Statistics statistics) {
        userNumber = statistics.usersNames().size();
        postsNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();
    }
}
