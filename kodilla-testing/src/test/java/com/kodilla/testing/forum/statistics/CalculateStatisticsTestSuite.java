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
    public void zeroPostsHoundredUsersTest(){

        Statistics calculateStatisticsMock = mock(Statistics.class);

        int posts = 0;

        List<String> nameList = new ArrayList<String>();
        for (int i = 0; i<100; i++) {
            nameList.add("user name");
        }

        when(calculateStatisticsMock.postsCount()).thenReturn(posts);
        when(calculateStatisticsMock.usersNames()).thenReturn(nameList);

        CalculateStatistics calculateStatistics = new CalculateStatistics();

        calculateStatistics.calculateAdvStatistics(calculateStatisticsMock);

        Assert.assertEquals(0, calculateStatistics.getAverageAmountOfPostsPerUser(), 1000);

        calculateStatistics.showStatistics();
    }
    @Test
    public void thousandPostsZeroUsersTest() {

        Statistics calculateStatisticsMock = mock(Statistics.class);

        int posts = 1000;
        List<String> nameList = new ArrayList<String>();

        when(calculateStatisticsMock.postsCount()).thenReturn(posts);
        when(calculateStatisticsMock.usersNames()).thenReturn(nameList);

        CalculateStatistics calculateStatistics = new CalculateStatistics();

        calculateStatistics.calculateAdvStatistics(calculateStatisticsMock);

        Assert.assertEquals(0, calculateStatistics.getAverageAmountOfPostsPerUser(), 1000);

        calculateStatistics.showStatistics();
    }
    @Test
    public void fewerCommentsThanPostsTest() {
        Statistics calculateStatisticsMock = mock(Statistics.class);

        int posts = 253;
        int comments = 350;

        when(calculateStatisticsMock.postsCount()).thenReturn(posts);
        when(calculateStatisticsMock.commentsCount()).thenReturn(comments);

        CalculateStatistics calculateStatistics = new CalculateStatistics();

        calculateStatistics.calculateAdvStatistics(calculateStatisticsMock);

        Assert.assertEquals(1.0, calculateStatistics.getAverageAmountOfCommentsPerPost(), 0.01);

        calculateStatistics.showStatistics();
    }
    @Test
    public void zeroCommentsZeroUsersTest(){
        Statistics calculateStatisticsMock = mock(Statistics.class);

        List<String> nameList = new ArrayList<String>();
        int comments = 0;

        when(calculateStatisticsMock.usersNames()).thenReturn(nameList);
        when(calculateStatisticsMock.commentsCount()).thenReturn(comments);

        CalculateStatistics calculateStatistics = new CalculateStatistics();

        calculateStatistics.calculateAdvStatistics(calculateStatisticsMock);

        Assert.assertEquals(0, calculateStatistics.getAverageAmountOfCommentsPerUser(), 0.01);

        calculateStatistics.showStatistics();
    }

}
