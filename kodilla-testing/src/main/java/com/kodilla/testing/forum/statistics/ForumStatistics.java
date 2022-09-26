package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class ForumStatistics {
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averagePostsOnUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPosts;


    List<String> usersNames(){
        List<String> userList = new ArrayList<>();
        return userList;
    }

    public int postsCount(){
        return numberOfPosts;
    }

    public int commentsCount(){
        return  numberOfComments;
    }

    public void calculateAdvStatistics(Statistics statistics){
       numberOfUsers = statistics.usersNames().size();
       numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        if(numberOfUsers > 0){
            double tempNumberOfUsers = numberOfUsers;
            averagePostsOnUser = numberOfPosts / tempNumberOfUsers;
            averageCommentsPerUser = numberOfComments/tempNumberOfUsers;
        } else{
            averagePostsOnUser = 0;
            averageCommentsPerUser = 0;
        }
        if (numberOfPosts > 0){
            double temporaryPostsNumber = numberOfPosts;
            averageCommentsPerPosts = numberOfComments/temporaryPostsNumber;
        } else{
            averageCommentsPerPosts = 0;
        }
    }

    public void showStatistics(Statistics statistics){
        System.out.println("Forum Statistics:");
        System.out.println("On forum we have: " + numberOfUsers + " users");
        System.out.println("The forum contains: " + numberOfPosts + " posts");
        System.out.println("The forum contains: " + numberOfComments + " comments");
        System.out.println("Average posts per user: " + averagePostsOnUser);
        System.out.println("Average comments per user: " + averageCommentsPerUser);
        System.out.println("Average comments per post: " + averageCommentsPerPosts);
    }

    public int getUsersNumber() {
        return numberOfUsers;
    }

    public int getPostsNumber() {
        return numberOfPosts;
    }

    public int getCommentsNumber() {
        return numberOfComments;
    }

    public double getAveragePostsPerUser() {
        return averagePostsOnUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPosts() {
        return averageCommentsPerPosts;
    }
}