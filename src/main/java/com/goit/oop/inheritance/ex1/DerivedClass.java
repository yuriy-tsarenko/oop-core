package com.goit.oop.inheritance.ex1;

/**
 * Клас DerivedClass є нащадком класу BaseClass.
 * Він перевизначає публічне поле publicField та захищене поле protectedField.
 */
public class DerivedClass extends BaseClass {
    /**
     * Конструктор класу DerivedClass.
     * Він перевизначає публічне поле publicField та захищене поле protectedField.
     */
    public DerivedClass() {
        publicField = "DerivedClass.publicField";
        protectedField = "DerivedClass.protectedField";
    }
}