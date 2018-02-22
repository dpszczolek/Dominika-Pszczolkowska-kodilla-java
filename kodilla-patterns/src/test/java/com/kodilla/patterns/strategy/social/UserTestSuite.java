package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User john = new Millenials("John Doe");
        User jane = new YGeneration("Jane Doe");
        User ken = new ZGeneration("Ken Jen");

        //When
        String johnsPublisher = john.publisher();
        System.out.println("John " + johnsPublisher);
        String janesPublisher = jane.publisher();
        System.out.println("Jane " + janesPublisher);
        String kensPublisher = ken.publisher();
        System.out.println("Ken " + kensPublisher);

        //Then
        Assert.assertEquals("uses Facebook", johnsPublisher);
        Assert.assertEquals("uses Twitter", janesPublisher);
        Assert.assertEquals("uses Snapchat", kensPublisher);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User john = new Millenials("John Doe");

        //When
        String johnsPublisher = john.publisher();
        System.out.println("John " + johnsPublisher);
        john.setIndividualPublisher(new TwitterPublisher());
        johnsPublisher = john.publisher();
        System.out.println("John " + johnsPublisher);

        //Then
        Assert.assertEquals("uses Twitter", johnsPublisher);
    }
}
