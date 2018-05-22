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
       System.out.println("Number of Users: " + numberOfUsers()
               + "\n" + "Number of Posts: " + numberOfPosts()
               + "\n" + "Number of Comments: " + numberOfComments()
               + "\n" + "Average number of posts per user: " + avgPostsPerUser()
               + "\n" + "Average number of comments per user: " + avgCommentsPerUser()
               + "\n" + "Average number of comments per post: " + avgCommentsPerPost());
    }
}
