package com.goit.oop.inner_classes.ex2;

/**
 * Головний клас Main, який демонструє використання анонімних класів.
 * Анонімні класи - це особливий тип внутрішніх класів, які не мають назви.
 * Вони використовуються для створення екземпляра об'єкта з певними модифікаціями, які потрібно використовувати лише один раз.
 */
public class Main {
    public static void main(String[] args) {
        // Оголошення анонімного (внутрішнього) класу, який реалізує ConcreteClass
        ConcreteClass instance1 = new ConcreteClass() {
            @Override
            public void method() {
                System.out.println("instance1: method()");
            }
        };
        // Оголошення анонімного (внутрішнього) класу, який реалізує Interface
        Interface instance2 = new ConcreteClass() {
            int protectedField = 3;

            @Override
            public void method() {
                System.out.println("instance2: method()");
            }

            @Override
            public int getValue() {
                return this.protectedField + super.getValue();
            }
        };

        instance1.method();
        instance2.method();

        System.out.println("instance1: publicField = " + instance1.getValue() + "    instance2: publicField = "
                + instance2.getValue());
    }
}