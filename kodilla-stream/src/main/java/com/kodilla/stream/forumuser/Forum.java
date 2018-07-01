package com.kodilla.stream.forumuser;

import java.util.*;

public final class Forum {
    private final List<ForumUser> forumUsersList= new ArrayList<>();

    public Forum(){
        forumUsersList.add(new ForumUser(121, "Janek", 'M', 20, 1, 1976, 16));
        forumUsersList.add(new ForumUser(132, "Dorota", 'F', 14, 2, 1985, 12));
        forumUsersList.add(new ForumUser(148, "Małgorzata", 'F', 30, 7, 1981, 0));
        forumUsersList.add(new ForumUser(149, "Bartek", 'M', 12, 5, 2001, 5));
        forumUsersList.add(new ForumUser(136, "Mateusz", 'M', 21, 4, 1992, 0));
        forumUsersList.add(new ForumUser(116, "Ewa", 'F', 25, 1, 1979, 1));
        forumUsersList.add(new ForumUser(156, "Mariusz", 'M', 7, 12, 1997, 51));
    }

    public List<ForumUser> getForumUsersList() {
        return new ArrayList<>(forumUsersList);
    }
}
