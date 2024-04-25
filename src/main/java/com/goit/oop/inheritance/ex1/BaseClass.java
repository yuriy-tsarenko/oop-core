package com.goit.oop.inheritance.ex1;

/**
 * Клас BaseClass є нащадком абстрактного класу AbstractClass та реалізує інтерфейс Interface.
 * Він містить публічне поле publicField, приватне поле privateField та захищене поле protectedField.
 * Також він перевизначає метод print() з абстрактного класу AbstractClass.
 */
public class BaseClass extends AbstractClass implements Interface {

    // Публічне поле класу BaseClass
    public String publicField = "BaseClass.publicField";

    // Приватне поле класу BaseClass
    private String privateField = "BaseClass.privateField";

    // Захищене поле класу BaseClass
    protected String protectedField = "BaseClass.protectedField";

    /**
     * Перевизначення методу print() з абстрактного класу AbstractClass.
     * Цей метод виводить на екран текст "print".
     */
    @Override
    public void print() {
        System.out.println("print");
    }
}