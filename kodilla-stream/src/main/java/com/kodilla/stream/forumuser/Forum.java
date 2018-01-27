package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUsersList = new ArrayList<>();

    public Forum (){
        forumUsersList.add(new ForumUser(1, "Naruto", 'M', LocalDate.of(1980, 9,2), 10));
        forumUsersList.add(new ForumUser(2, "Sakura", 'F', LocalDate.of(1988, 9,2), 100));
        forumUsersList.add(new ForumUser(3, "Sasuke", 'M', LocalDate.of(1975, 9,2), 15));
        forumUsersList.add(new ForumUser(4, "Itachi", 'M', LocalDate.of(1960, 9,2), 20));
        forumUsersList.add(new ForumUser(5, "Kakashi", 'M', LocalDate.of(1950, 9,2), 0));
        forumUsersList.add(new ForumUser(6, "Hinata", 'F', LocalDate.of(1990, 9,2), 30));
        forumUsersList.add(new ForumUser(7, "Sarada", 'M', LocalDate.of(2000, 9,2), 30));
        forumUsersList.add(new ForumUser(8, "Sai", 'F', LocalDate.of(2010, 9,2), 140));
        forumUsersList.add(new ForumUser(9, "Lee", 'M', LocalDate.of(1995, 9,2), 1300));
        forumUsersList.add(new ForumUser(10, "Yamato", 'M', LocalDate.of(1999, 9,2), 10));
    }

    public List<ForumUser> getUserList () {
        return new ArrayList<>(forumUsersList);
    }
}
