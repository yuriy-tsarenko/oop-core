package com.goit.oop.key.words;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        User user1 = userService.createUser(generateString(), generateString(), generateString());
        User user2 = userService.createUser(generateString(), generateString(), generateString());
        System.out.println(user1);
        System.out.println(user2);
    }

    public static String generateString() {
        return UUID.randomUUID().toString();
    }
}
