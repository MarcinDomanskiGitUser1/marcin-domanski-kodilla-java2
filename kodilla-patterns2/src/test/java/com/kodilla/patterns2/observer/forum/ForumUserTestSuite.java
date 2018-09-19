package com.kodilla.patterns2.observer.forum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ForumUserTestSuite {

    @Test
    public void shouldDoSomething() {
        // Given
        ForumTopic javaHelpForum = new JavaHelperForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser jacekPirat = new ForumUser("Jacek Pirat");
        ForumUser zbigniewDrzazga = new ForumUser("Zbigniew Drzazga");
        ForumUser filipSztos = new ForumUser("Filip Sztos");
        javaHelpForum.registerObserver(jacekPirat);
        javaToolsForum.registerObserver(zbigniewDrzazga);
        javaHelpForum.registerObserver(filipSztos);
        javaToolsForum.registerObserver(filipSztos);
        // When
        javaHelpForum.addPost("Hi everyone! Could you help me with for loop?");
        javaHelpForum.addPost("Better try while loop in this case");
        javaHelpForum.addPost("Why wihle? Is it better?");
        javaToolsForum.addPost("Help, my MySQL db doesn't want to work :(");
        javaToolsForum.addPost("When I try to log in I got 'bad credentials' message");
        // Then
        assertEquals(3, jacekPirat.getUpdateCount());
        assertEquals(5, filipSztos.getUpdateCount());
        assertEquals(2, zbigniewDrzazga.getUpdateCount());
    }
}
