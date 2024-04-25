package com.goit.oop.modifiers.private_modifier;

public class PrivateModifiers {
    private Long id;
    private String name2;

    private void doSomething() {
        //...code
    }

    private PrivateModifiers() {
    }

    public static PrivateModifiers instance() {
        return new PrivateModifiers();
    }

    public void setName(String name) {
        this.name2 = name;
    }

    public String getName() {
        return this.name2;
    }
}
