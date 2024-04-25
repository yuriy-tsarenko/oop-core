package com.goit.oop.inheritance.ex1;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DerivedClass instance = new DerivedClass();
        System.out.println(instance.publicField);
        instance.print();
        ArrayList<String> list = new ArrayList<>();
    }
}
