package com.goit.oop.inner_classes.ex1;

/**
 * Вкладені класи.
 */
class MyClass {

    /**
     * Внутрішній клас Nested.
     */
    public class Nested {

        private String field;

        /**
         * Метод внутрішнього класу Nested.
         */
        public void method() {
            System.out.println("Метод з Nested класу" + field);
        }
    }
}