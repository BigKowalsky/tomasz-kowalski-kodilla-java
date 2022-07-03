package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTestSuite {
    private static int testCounter = 0;

    @Mock
    private Statistics statistics;


    @BeforeAll
    public static void beforeAllTests(){
        System.out.println("Tests are starting.");
    }

    @AfterAll
    public static void afterAllTests(){
        System.out.println("Tests finished");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter ++;
        System.out.println("Test #" + testCounter);
    }

    @AfterEach
    public void afterEveryTest(){
        System.out.println("Test #" + testCounter + " done");
    }

    @Test
    void testCalculateAdvStatisticsPosts0(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statistics.postsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statistics);
        //Then
        assertEquals(0, forumStatistics.getPostsNumber());
    }

    @Test
    void testCalculateAdvStatisticsPosts1000(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statistics.postsCount()).thenReturn(1000);
        //When
        forumStatistics.calculateAdvStatistics(statistics);
        //Then
        assertEquals(1000, forumStatistics.getPostsNumber());
    }

    @Test
    void testCalculateAdvStatisticsComments0(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statistics.commentsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statistics);
        //Then
        assertEquals(0, forumStatistics.getCommentsNumber());
    }

    @Test
    void testCalculateAdvStatisticsMoreCommentsThanPosts(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statistics.commentsCount()).thenReturn(100);
        when(statistics.postsCount()).thenReturn(10);
        //When
        forumStatistics.calculateAdvStatistics(statistics);
        //Then
        assertEquals(100, forumStatistics.getCommentsNumber());
        assertEquals(10, forumStatistics.getPostsNumber());
    }

    @Test
    void testCalculateAdvStatisticsMorePostsThanComments(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statistics.postsCount()).thenReturn(50);
        when(statistics.commentsCount()).thenReturn(15);
        //When
        forumStatistics.calculateAdvStatistics(statistics);
        //Then
        assertEquals(50,forumStatistics.getPostsNumber());
        assertEquals(15, forumStatistics.getCommentsNumber());
    }

    @Test
    void testCalculateAdvStatisticsZeroUsers(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> usersList = new ArrayList<>();
        when(statistics.usersNames()).thenReturn(usersList);
        //When
        forumStatistics.calculateAdvStatistics(statistics);
        //Then
        assertEquals(0, forumStatistics.usersNames().size());
    }

    @Test
    void testCalculateAdvStatistics100Users(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> userList = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            userList.add("User " + i);
        }
        when(statistics.usersNames()).thenReturn(userList);
        //When
        forumStatistics.calculateAdvStatistics(statistics);
        //Then
        assertEquals(100, forumStatistics.getUsersNumber());
    }
}
