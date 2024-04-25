package com.goit.oop.overriding;


public class ChildClass extends BaseClass {

    //Перевизначення
    @Override
    protected String generateToken() {
        return "Test";
    }

    //Імплементація
    @Override
    protected String createSession() {
        return "";
    }
}
