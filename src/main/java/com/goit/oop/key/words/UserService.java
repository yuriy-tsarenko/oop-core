package com.goit.oop.key.words;

import java.util.Date;

//this - це ключове слово яке дозволяє звертатися до обєкту класу з середини цього ж класу
//super - це ключове слово яке дозволяє звертатися до обєкту супер класу з середини цього чайлд класу
public class UserService {

    public User createUser(String username, String email, String gender) {
        User user = new User();
        long time = generateId();
        user.setId(time);
        user.setUsername(username);
        user.setEmail(email);
        user.setGender(gender);
        return user;
    }

    private static long generateId() {
        return new Date().getTime();
    }
}
