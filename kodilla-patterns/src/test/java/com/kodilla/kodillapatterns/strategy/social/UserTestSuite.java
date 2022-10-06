package com.kodilla.kodillapatterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User user1 = new Millenials("Jan Malinowski");
        User user2 = new YGeneration("Paweł Jabłoński");
        User user3 = new ZGeneration("Piotr Krawczyk");
        //When
        String user1Social = user1.sharePost();
        System.out.println("Jan Malinowski uses: " + user1Social);
        String user2Social = user2.sharePost();
        System.out.println("Paweł Jabłoński uses: " + user2Social);
        String user3Social = user3.sharePost();
        System.out.println("Piotr Krawczyk uses: " + user3Social);
        //Then
        assertEquals(user3Social, "Snapchat");
        assertEquals(user1Social, "Facebook");
        assertEquals(user2Social, "Twitter");
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User user1 = new Millenials("Jan Malinowski");
        //When
        String user1Social = user1.sharePost();
        System.out.println("Jan Malinowski prefer use:  " + user1Social);
        user1.selectSocial(new SnapchatPublisher());
        //Then
        assertEquals("Facebook", user1Social);
    }
}
