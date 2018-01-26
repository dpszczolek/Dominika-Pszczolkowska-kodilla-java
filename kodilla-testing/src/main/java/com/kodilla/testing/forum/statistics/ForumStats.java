package com.kodilla.testing.forum.statistics;

class ForumStats {
    Statistics statistics;

    public ForumStats (Statistics statistics) {
        this.statistics = statistics;
    }
    public int numberOfUsers () {
        int quantityOfUsers = statistics.usersNames().size();
        return quantityOfUsers;
    }
    public int numberOfPosts () {
        int pC = statistics.postsCount();
        return pC;
    }
    public int numberOfComments () {
        int cC = statistics.commentsCount();
        return cC;
    }
    public double avgPostsPerUser () {
        double aPostPerUser = (double) numberOfPosts()/numberOfUsers();
        return aPostPerUser;
    }
    public double avgCommentsPerUser () {
        double aCommentsPerUser = (double) numberOfComments()/numberOfUsers();
        return aCommentsPerUser;
    }
    public double avgCommentsPerPost () {
        double aCommentsPerPost = (double) numberOfComments()/numberOfPosts();
        return aCommentsPerPost;
    }
    public void calculateAdvStatistics(Statistics statistics) {
     //   ...
    }

   public void showStatistics () {
        System.out.println("Number of users is " + numberOfUsers());
        System.out.println("Number of posts is " + numberOfPosts());
        System.out.println("Number of comments is " + numberOfComments());
        System.out.println("Average number of posts per user is " + avgPostsPerUser());
        System.out.println("Average number of comments per user is " + avgCommentsPerUser());
        System.out.println("Average number of comments per post is " + avgCommentsPerPost());
    }
}
