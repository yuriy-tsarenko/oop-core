package com.goit.oop.inner_classes.ex1;

/**
 * Головний клас Main, який демонструє використання внутрішніх класів та патерну Builder.
 */
public class Main {
    public static void main(String[] args) {
        // Створення екземпляра внутрішнього класу Nested
        MyClass.Nested instance = new MyClass().new Nested();
        // Виклик методу внутрішнього класу
        instance.method();

        // Створення екземпляра класу Demo за допомогою патерну Builder
        Demo demo = Demo.builder()
                .address("address")
                .value("sss")
                .email("@email")
                .build();

        // Виведення інформації про екземпляр класу Demo
        System.out.println(demo);
    }
}