package com.kodilla.testing.forum.statistics;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class ForumStatisticsTestSuite {
    @Before
    public void beforeTest () {
        System.out.println("Starting test");
    }
    @AfterClass
    public static void afterAllTests () {
        System.out.println("All tests finished");
    }
    @Test
    public void testZeroPostsAndComments () {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> names = new ArrayList<String>();
        names.add("Elisabeth");
        names.add("William");
        names.add("Philip");
        names.add("Oliver");
        int postsCount = 0;
        int commentsCount = 0;
        when(statisticsMock.usersNames()).thenReturn(names);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postsCount()).thenReturn(postsCount);

        ForumStats fs = new ForumStats(statisticsMock);
        fs.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(postsCount, fs.numberOfPosts());
        Assert.assertEquals(commentsCount, fs.numberOfComments());
    }
    @Test
    public void testThousandPosts () {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> names = new ArrayList<String>();
        names.add("Elisabeth");
        names.add("William");
        names.add("Philip");
        names.add("Oliver");
        int postsCount = 1000;
        int commentsCount = 10;
        when(statisticsMock.usersNames()).thenReturn(names);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postsCount()).thenReturn(postsCount);

        ForumStats fs = new ForumStats(statisticsMock);
        fs.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(postsCount, fs.numberOfPosts());
    }
    @Test
    public void testPostsMoreThanComments () {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> names = new ArrayList<String>();
        names.add("Elisabeth");
        names.add("William");
        names.add("Philip");
        names.add("Oliver");
        int postsCount = 1000;
        int commentsCount = 10;
        when(statisticsMock.usersNames()).thenReturn(names);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postsCount()).thenReturn(postsCount);

        ForumStats fs = new ForumStats(statisticsMock);
        fs.calculateAdvStatistics(statisticsMock);
        double avgCommentsPerPost = fs.avgCommentsPerPost();

        Assert.assertEquals(0.01, avgCommentsPerPost, 0);
    }
    @Test
    public void testPostsLessThanComments () {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> names = new ArrayList<String>();
        names.add("Elisabeth");
        names.add("William");
        names.add("Philip");
        names.add("Oliver");
        int postsCount = 100;
        int commentsCount = 1000;
        when(statisticsMock.usersNames()).thenReturn(names);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postsCount()).thenReturn(postsCount);

        ForumStats fs = new ForumStats(statisticsMock);
        fs.calculateAdvStatistics(statisticsMock);

        double avgCommentsPerPost = fs.avgCommentsPerPost();

        Assert.assertEquals(10, avgCommentsPerPost, 0);
    }
    @Test
    public void testZeroUsers () {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> names = new ArrayList<String>();
        int postsCount = 0;
        int commentsCount = 0;
        when(statisticsMock.usersNames()).thenReturn(names);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postsCount()).thenReturn(postsCount);

        ForumStats fs = new ForumStats(statisticsMock);
        fs.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(names.size(), fs.numberOfUsers());
    }
    @Test
    public void testHundredUsers () {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> names = new ArrayList<String>();
        for(int i = 0; i<1000; i++) {
            names.add("Henry");
        }
        int postsCount = 2000;
        int commentsCount = 100000;
        when(statisticsMock.usersNames()).thenReturn(names);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postsCount()).thenReturn(postsCount);

        ForumStats fs = new ForumStats(statisticsMock);
        fs.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(names.size(), fs.numberOfUsers());
    }


}
