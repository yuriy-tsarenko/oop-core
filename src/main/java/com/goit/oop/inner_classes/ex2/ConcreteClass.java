package com.goit.oop.inner_classes.ex2;

/**
 * Конкретний клас ConcreteClass, який реалізує інтерфейс Interface.
 * Цей клас містить метод method() та getValue(), які перевизначають відповідні методи інтерфейсу.
 */
public class ConcreteClass implements Interface {

    protected int protectedField = 1;

    /**
     * Метод method(), який перевизначає відповідний метод інтерфейсу Interface.
     */
    @Override
    public void method() {
        System.out.println("ConcreteClass: method()");
    }

    /**
     * Метод getValue(), який перевизначає відповідний метод інтерфейсу Interface.
     * Цей метод повертає значення поля protectedField.
     */
    @Override
    public int getValue() {
        return this.protectedField;
    }
}