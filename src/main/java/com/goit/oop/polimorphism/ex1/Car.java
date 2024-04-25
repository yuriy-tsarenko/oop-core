package com.goit.oop.polimorphism.ex1;

public class Car implements Vehicle {
    @Override
    public String runEngine() {
        return "Car works";
    }
}
