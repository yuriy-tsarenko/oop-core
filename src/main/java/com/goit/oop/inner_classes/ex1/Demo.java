package com.goit.oop.inner_classes.ex1;

/**
 * Клас Demo містить приватні поля value, name, email, address, phone.
 * Він також містить внутрішній статичний клас DemoBuilder для побудови екземплярів класу Demo.
 */
public class Demo {

    private String value;
    private String name;
    private String email;
    private String address;
    private String phone;

    /**
     * Конструктор класу Demo.
     */
    Demo(String value, String name, String email, String address, String phone) {
        this.value = value;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
    }

    /**
     * Статичний метод builder(), який повертає новий екземпляр класу DemoBuilder.
     */
    public static DemoBuilder builder() {
        return new DemoBuilder();
    }

    /**
     * Перевизначення методу toString() для класу Demo.
     */
    public String toString() {
        return "Demo(value=" + this.value + ", name=" + this.name + ", email=" + this.email + ", address=" + this.address + ", phone=" + this.phone + ")";
    }

    /**
     * Внутрішній статичний клас DemoBuilder для побудови екземплярів класу Demo.
     */
    public static class DemoBuilder {
        private String value;
        private String name;
        private String email;
        private String address;
        private String phone;

        /**
         * Конструктор класу DemoBuilder.
         */
        DemoBuilder() {
        }

        /**
         * Методи для встановлення значень полів класу Demo.
         */
        public DemoBuilder value(String value) {
            this.value = value;
            return this;
        }

        public DemoBuilder name(String name) {
            this.name = name;
            return this;
        }

        public DemoBuilder email(String email) {
            this.email = email;
            return this;
        }

        public DemoBuilder address(String address) {
            this.address = address;
            return this;
        }

        public DemoBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        /**
         * Метод build(), який створює новий екземпляр класу Demo з встановленими значеннями полів.
         */
        public Demo build() {
            return new Demo(value, name, email, address, phone);
        }

        /**
         * Перевизначення методу toString() для класу DemoBuilder.
         */
        public String toString() {
            return "Demo.DemoBuilder(value=" + this.value + ", name=" + this.name + ", email=" + this.email + ", address=" + this.address + ", phone=" + this.phone + ")";
        }
    }
}