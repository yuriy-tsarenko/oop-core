package com.goit.oop.key.words;

public class User extends BaseClass {
    private Long id;
    private String username;
    private String gender;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getEmail() {
        return super.email;
    }

    @Override
    public void setEmail(String newEmail) {
        super.email = newEmail;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
