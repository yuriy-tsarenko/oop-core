package com.goit.oop.overriding;

import java.util.UUID;

public abstract class BaseClass {

    protected String generateToken() {
        return UUID.randomUUID().toString();
    }

    protected abstract String createSession();
}
