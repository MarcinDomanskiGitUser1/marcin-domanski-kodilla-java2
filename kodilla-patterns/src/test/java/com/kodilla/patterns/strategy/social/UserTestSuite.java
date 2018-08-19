package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.socialmedia.FacebookPublisher;
import com.kodilla.patterns.strategy.social.users.Millenials;
import com.kodilla.patterns.strategy.social.users.User;
import com.kodilla.patterns.strategy.social.users.YGeneration;
import com.kodilla.patterns.strategy.social.users.ZGeneration;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User millenials1 = new Millenials("Mietek");
        User yGeneration1 = new YGeneration("Yeti");
        User zGeneration1 = new ZGeneration("Zenek");

        //When
        String millenialsUse = millenials1.sharePost();
        System.out.println(millenials1.getUserName() + " używa " + millenialsUse);

        String yGenerationUse = yGeneration1.sharePost();
        System.out.println(yGeneration1.getUserName() + " używa " + yGenerationUse);

        String zGenerationUse = zGeneration1.sharePost();
        System.out.println(zGeneration1.getUserName() + " używa " + zGenerationUse);

        //Then
        Assert.assertEquals("Udostępnianie przez Facebook", millenialsUse);
        Assert.assertEquals("Udostępnianie przez Snapchat", yGenerationUse);
        Assert.assertEquals("Udostępnianie przez Twitter", zGenerationUse);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User zGeneration1 = new ZGeneration("Zenek");

        //When
        zGeneration1.setSocialNetwork(new FacebookPublisher());
        String zGenerationChange = zGeneration1.sharePost();
        System.out.println(zGeneration1.getUserName() + " zmienia na " + zGenerationChange);

        //Then
        Assert.assertEquals("Udostępnianie przez Facebook", zGenerationChange);
    }
}
