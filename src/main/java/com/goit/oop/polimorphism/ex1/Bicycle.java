package com.goit.oop.polimorphism.ex1;

public class Bicycle implements Vehicle {
    @Override
    public String runEngine() {
        return "bicycle haven't engine";
    }
}
