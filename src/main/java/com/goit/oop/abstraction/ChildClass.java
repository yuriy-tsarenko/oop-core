package com.goit.oop.abstraction;

/**
 * Клас ChildClass, який є нащадком абстрактного класу AbstractClass.
 * Він реалізує абстрактні методи базового класу.
 */
class ChildClass extends AbstractClass {

    // Реалізація абстрактного методу classname() з базового класу
    @Override
    public void classname() {
        String name = ChildClass.class.getName();
        System.out.println(name);
    }

    // Реалізація методу print() з базового класу
    @Override
    public void print() {
        System.out.println("Implementation");
    }
}