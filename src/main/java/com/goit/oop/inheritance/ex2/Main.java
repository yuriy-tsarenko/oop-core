package com.goit.oop.inheritance.ex2;

/**
 * Клас Main демонструє приведення типів в Java.
 * Він створює екземпляр класу DerivedClass, приводить його до базового типу BaseClass (upcast),
 * а потім знову приводить до типу DerivedClass (downcast).
 */
public class Main {
    public static void main(String[] args) {
        // Створення екземпляра класу DerivedClass
        DerivedClass instance = new DerivedClass();

        // Ініціалізація полів
        instance.field1 = 1;
        instance.field2 = 2;
        instance.field3 = 3;
        instance.field4 = 4;
        instance.field5 = 5;

        // Приведення екземпляра класу DerivedClass до базового типу BaseClass (upcast)
        BaseClass newInstance = (BaseClass) instance;

        // Приведення newInstance до типу DerivedClass (downcast)
        DerivedClass derivedClass = (DerivedClass) newInstance;

        // Виведення значень полів
        System.out.println(newInstance.field1);
        System.out.println(newInstance.field2);
        System.out.println(newInstance.field3);
        System.out.println(derivedClass.field4);
        System.out.println(derivedClass.field5);

        // Перевірка, що instance та newInstance вказують на один і той же об'єкт
        System.out.println("instance Id:     " + instance.hashCode());
        System.out.println("newInstance Id:  " + newInstance.hashCode());
    }
}