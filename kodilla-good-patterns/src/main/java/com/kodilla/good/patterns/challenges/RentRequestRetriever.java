package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class RentRequestRetriever {
    public RentRequest retrieve () {
        User user = new User("Jane", "Doe");
        LocalDateTime rentFrom = LocalDateTime.of(2010, 9, 8, 15, 45);
        LocalDateTime rentTo = LocalDateTime.of(2010, 9, 8, 16, 30);
        return new RentRequest(user, rentFrom, rentTo);
    }
}
