package com.goit.oop.inheritance.ex3;

public sealed interface Vehicle permits Plane {

    void hello();
}
