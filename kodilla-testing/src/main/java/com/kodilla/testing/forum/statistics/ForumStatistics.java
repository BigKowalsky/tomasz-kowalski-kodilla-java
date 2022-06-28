package com.kodilla.testing.forum.statistics;

import java.util.List;

public class ForumStatistics {
    private Statistics statistics;

    public void calculateAdvStatistics(Statistics statistics){
        this.statistics = statistics;
    }

    public List<String> getUserName() {
        return statistics.usersNames();
    }

    public int getPostsQuantity() {
        return statistics.postsCount();
    }

    public int getCommentsQuantity() {
        return statistics.commentsCount();
    }
    public double getAveragePostsPerUser() {
        return (double) statistics.postsCount()/(double) statistics.usersNames().size();
    }

    public double getAverageCommentsPerUser() {
        return (double) statistics.commentsCount()/(double) statistics.usersNames().size();
    }

    public double getAverageCommentsPerPost() {
        if (statistics.commentsCount() > statistics.postsCount())
            return statistics.commentsCount()/statistics.postsCount();
        else {
            return  (double) statistics.commentsCount()/(double)statistics.postsCount();
        }
    }
    public String showStatistics(){
        return "Show average posts per user: " + getAveragePostsPerUser()
                + "\nShow average comments per user: " + getAverageCommentsPerUser();
    }
}
