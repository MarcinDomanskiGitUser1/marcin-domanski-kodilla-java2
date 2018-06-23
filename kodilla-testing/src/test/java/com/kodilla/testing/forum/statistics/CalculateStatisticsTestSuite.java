package com.kodilla.testing.forum.statistics;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticsTestSuite {
    @Before
    public void before(){
        System.out.println("Start test");
    }
    @After
    public void after(){
        System.out.println("End test");
    }

    @Test
    public void zeroPostsHundredUsersTest(){

        int posts = 0;
        int comments = 563;
        List<String> nameList = new ArrayList<String>();
        for (int i = 0; i<100; i++) {
            nameList.add("user name");
        }

        Statistics calculateStatisticsMock = mock(Statistics.class);
        when(calculateStatisticsMock.postsCount()).thenReturn(posts);
        when(calculateStatisticsMock.usersNames()).thenReturn(nameList);
        when(calculateStatisticsMock.commentsCount()).thenReturn(comments);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(calculateStatisticsMock);

        Assert.assertEquals(0, calculateStatistics.getAverageAmountOfPostsPerUser(), 0.01);
        Assert.assertEquals(5, calculateStatistics.getAverageAmountOfCommentsPerUser(), 0.01);
        Assert.assertEquals(0, calculateStatistics.getAverageAmountOfCommentsPerPost(), 0.01);

        calculateStatistics.showStatistics();
    }
    @Test
    public void thousandPostsZeroUsersTest() {

        int posts = 1000;
        int comments = 753;
        List<String> nameList = new ArrayList<String>();

        Statistics calculateStatisticsMock = mock(Statistics.class);
        when(calculateStatisticsMock.postsCount()).thenReturn(posts);
        when(calculateStatisticsMock.usersNames()).thenReturn(nameList);
        when(calculateStatisticsMock.commentsCount()).thenReturn(comments);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(calculateStatisticsMock);

        Assert.assertEquals(0, calculateStatistics.getAverageAmountOfPostsPerUser(), 0.01);
        Assert.assertEquals(0, calculateStatistics.getAverageAmountOfCommentsPerUser(), 0.01);
        Assert.assertEquals(0, calculateStatistics.getAverageAmountOfCommentsPerPost(), 0.01);

        calculateStatistics.showStatistics();
    }
    @Test
    public void fewerCommentsThanPostsTest() {

        int posts = 253;
        int comments = 350;
        List<String> nameList = new ArrayList<String>();
        for (int i = 0; i<563; i++) {
            nameList.add("user name");
        }

        Statistics calculateStatisticsMock = mock(Statistics.class);
        when(calculateStatisticsMock.postsCount()).thenReturn(posts);
        when(calculateStatisticsMock.commentsCount()).thenReturn(comments);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(calculateStatisticsMock);

        Assert.assertEquals(0, calculateStatistics.getAverageAmountOfPostsPerUser(), 0.01);
        Assert.assertEquals(0, calculateStatistics.getAverageAmountOfCommentsPerUser(), 0.01);
        Assert.assertEquals(1, calculateStatistics.getAverageAmountOfCommentsPerPost(), 0.01);

        calculateStatistics.showStatistics();
    }
    @Test
    public void moreCommentsThanPostsTest() {

        int posts = 481;
        int comments = 350;
        List<String> nameList = new ArrayList<String>();
        for (int i = 0; i<563; i++) {
            nameList.add("user name");
        }

        Statistics calculateStatisticsMock = mock(Statistics.class);
        when(calculateStatisticsMock.postsCount()).thenReturn(posts);
        when(calculateStatisticsMock.commentsCount()).thenReturn(comments);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(calculateStatisticsMock);

        Assert.assertEquals(0, calculateStatistics.getAverageAmountOfPostsPerUser(), 0.01);
        Assert.assertEquals(0, calculateStatistics.getAverageAmountOfCommentsPerUser(), 0.01);
        Assert.assertEquals(0, calculateStatistics.getAverageAmountOfCommentsPerPost(), 0.01);

        calculateStatistics.showStatistics();
    }
    @Test
    public void zeroCommentsZeroUsersTest(){

        int posts = 555;
        int comments = 0;
        List<String> nameList = new ArrayList<String>();

        Statistics calculateStatisticsMock = mock(Statistics.class);
        when(calculateStatisticsMock.usersNames()).thenReturn(nameList);
        when(calculateStatisticsMock.commentsCount()).thenReturn(comments);
        when(calculateStatisticsMock.postsCount()).thenReturn(posts);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(calculateStatisticsMock);

        Assert.assertEquals(0, calculateStatistics.getAverageAmountOfPostsPerUser(), 0.01);
        Assert.assertEquals(0, calculateStatistics.getAverageAmountOfCommentsPerUser(), 0.01);
        Assert.assertEquals(0, calculateStatistics.getAverageAmountOfCommentsPerPost(), 0.01);

        calculateStatistics.showStatistics();
    }
}
