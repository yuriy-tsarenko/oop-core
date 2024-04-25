package com.goit.oop.abstraction;

/**
 * Абстрактний клас AbstractClass.
 * Абстракція в ООП - це процес виокремлення важливих характеристик об'єкта, ігноруючи незначні або непотрібні деталі.
 * В даному випадку, AbstractClass - це абстрактний клас, який може містити абстрактні методи (методи без реалізації),
 * які повинні бути реалізовані в класах-нащадках.
 */
abstract class AbstractClass {

    // Константа класу
    static final String CONST = "AbstractClass constant";

    // Приватне поле класу
    private int count = 10;

    // Захищене поле класу
    protected double value = 10.0;

    // Публічне поле класу
    public String message = "zO7r7uTl9iDy+yDo7fLl8OXx8+X48f8g4vHl7P8g7OXr7vfg7Ogg8uDqIOTl8Obg8vw=";

    // Поле класу з базовим доступом
    String tokenBasicAuth = "Basic dXNlcjU1OnBBaGhzazMzNDU=";

    // Абстрактний метод, який повинен бути реалізований в класах-нащадках
    protected abstract void classname();

    // Публічний метод, який виводить повідомлення
    public void print() {
        System.out.println("Hi");
    }

    // Фінальний метод, який виводить ім'я класу
    public final void parentName() {
        String name = AbstractClass.class.getName();
        System.out.println(name);
    }

    // Статичний метод, який виводить ім'я класу
    public static void nameStatic() {
        String name = AbstractClass.class.getName();
        System.out.println(name);
    }
}