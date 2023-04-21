package com.user_service.service;


import com.user_service.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserServiceImp implements UserService {
    public static List<User> userList = new ArrayList<>();

    static {
        userList.add(new User(11, "ram", "9874512"));
        userList.add(new User(12, "shyam", "6453125"));
        userList.add(new User(13, "om", "64818312"));
    }

    @Override

    public User getUser(int id) {
        return this.userList.stream().filter(a -> a.getUserId() == (id)).findAny().orElse(null);
    }
}
