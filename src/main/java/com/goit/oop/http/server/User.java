package com.goit.oop.http.server;

public class User {
    private Long id;
    private String username;
    private Boolean isActive;

    public User(Long id, String username, Boolean isActive) {
        this.id = id;
        this.username = username;
        this.isActive = isActive;
    }

}