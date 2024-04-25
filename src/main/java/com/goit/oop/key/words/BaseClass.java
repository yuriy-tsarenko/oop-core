package com.goit.oop.key.words;

public abstract class BaseClass {
    protected String email;

    public abstract String getEmail();

    public abstract void setEmail(String email);


    public static void main(String[] args) {
        User user = new User();
        user.setEmail("Test");
        System.out.println(user.getEmail());

        BaseClass baseClass = (BaseClass)user;//апкастинг
        System.out.println(baseClass.getEmail());

        baseClass.setEmail("BaseClassEmail");
        System.out.println(baseClass.getEmail());

        User castedUser = (User) baseClass;//даункастинг
        System.out.println(castedUser.getEmail());

    }
}
