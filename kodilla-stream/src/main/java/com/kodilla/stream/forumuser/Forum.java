package com.kodilla.stream.forumuser;

import java.util.List;
import java.util.ArrayList;

public class Forum {
    List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, "PapaSmurf",'M', 1989, 12, 21, 32));
        userList.add(new ForumUser(2, "LittleCobra",'F', 1998, 6, 12,4));
        userList.add(new ForumUser(3, "Prometheus",'M', 1982, 9, 10, 0));
        userList.add(new ForumUser(4, "DiscoPotato",'F', 1995, 10, 10,10));
        userList.add(new ForumUser(5, "MadIrishman",'M', 2004, 5,23, 23));
        userList.add(new ForumUser(6, "SugarMan",'M', 1993, 2,28,2));
        userList.add(new ForumUser(7, "Necromancer",'M', 1999,  7,15,8));
        userList.add(new ForumUser(8, "Seppukku",'F', 2004, 4,26, 0));
    }

    public List<ForumUser> getUserList(){
        return new ArrayList<>(userList);
    }
}
