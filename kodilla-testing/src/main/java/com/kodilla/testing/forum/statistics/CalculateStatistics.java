package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {

    private double averageAmountOfPostsPerUser;
    private double averageAmountOfCommentsPerUser;
    private double averageAmountOfCommentsPerPost;

    public double getAverageAmountOfPostsPerUser() {
        return averageAmountOfPostsPerUser;
    }
    public double getAverageAmountOfCommentsPerUser() {
        return averageAmountOfCommentsPerUser;
    }
    public double getAverageAmountOfCommentsPerPost() {
        return averageAmountOfCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics){

        if(statistics.usersNames().size()>0) {
            averageAmountOfPostsPerUser = statistics.postsCount()/statistics.usersNames().size();
        }
        if(statistics.usersNames().size()>0) {
            averageAmountOfCommentsPerUser = statistics.commentsCount()/statistics.usersNames().size();
        }
        if(statistics.postsCount()>0) {
            averageAmountOfCommentsPerPost = statistics.commentsCount()/statistics.postsCount();
        }
    }

    public void showStatistics() {
        System.out.println("averageAmountOfPostsPerUser - " + averageAmountOfPostsPerUser);
        System.out.println("averageAmountOfCommentsPerUser - " + averageAmountOfCommentsPerUser);
        System.out.println("averageAmountOfCommentsPerPost - " + averageAmountOfCommentsPerPost);
    }

}
