package com.goit.oop.interfaces;

/**
 * Інтерфейс DemoInterface, який містить методи та константи для демонстрації роботи з інтерфейсами в Java.
 * Всі поля в інтерфейсі в Java є неявно public, static та final.
 */
interface DemoInterface {

    /**
     * Константа CONST типу String. Її значення не можна змінити після ініціалізації.
     */
    public static final String CONST = "Interface constant";

    /**
     * Константа count типу int. Її значення не можна змінити після ініціалізації.
     */
    public static final int count = 10;

    /**
     * Константа value типу double. Її значення не можна змінити після ініціалізації.
     */
    public static final double value = 10.0;

    /**
     * Константа message типу String. Її значення не можна змінити після ініціалізації.
     */
    public static final String message = "zO7r7uTl9iDy+yDo7fLl8OXx8+X48f8g4vHl7P8g7OXr7vfg7Ogg8uDqIOTl8Obg8vw=";

    /**
     * Константа tokenBasicAuth типу String. Її значення не можна змінити після ініціалізації.
     */
    public static final String tokenBasicAuth = "Basic dXNlcjU1OnBBaGhzazMzNDU=";

    /**
     * Абстрактний метод classname. Його потрібно реалізувати в класах, що реалізують цей інтерфейс.
     */
    public abstract void classname();

    /**
     * Метод за замовчуванням parentName. Він виводить ім'я цього інтерфейсу та викликає приватний метод.
     */
    public default void parentName() {
        String name = DemoInterface.class.getName();
        System.out.println(name);
        privateMethod();
    }

    /**
     * Статичний метод nameStatic. Він виводить ім'я цього інтерфейсу.
     */
    public static void nameStatic() {
        String name = DemoInterface.class.getName();
        System.out.println(name);
    }

    /**
     * Приватний метод privateMethod. Він виводить повідомлення.
     * Приватні методи в інтерфейсах використовуються для допомоги методам за замовчуванням.
     */
    private void privateMethod() {
        System.out.println("privateMethod");
    }
}