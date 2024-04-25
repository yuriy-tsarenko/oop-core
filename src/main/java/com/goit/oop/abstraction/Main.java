package com.goit.oop.abstraction;

/**
 * Головний клас Main.
 * Він створює екземпляр класу ChildClass, який є нащадком абстрактного класу AbstractClass,
 * і викликає його методи.
 */
public class Main {
    public static void main(String[] args) {
        // Створюємо екземпляр класу ChildClass
        AbstractClass instance = new ChildClass();

        // Викликаємо перевизначений метод print()
        instance.print();

        // Викликаємо реалізацію абстрактного методу classname()
        instance.classname();

        // Викликаємо статичний метод nameStatic() з абстрактного класу AbstractClass
        AbstractClass.nameStatic();

        // Викликаємо фінальний метод parentName()
        instance.parentName();
    }
}