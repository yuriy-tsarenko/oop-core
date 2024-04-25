package com.goit.oop.overloading;

import java.util.Date;

/**
 * Клас Overloading, який демонструє перевантаження методів в Java.
 * Перевантаження в Java - це можливість класу мати більше одного методу з однаковим ім'ям, якщо їх списки аргументів відрізняються.
 * Це приклад поліморфізму в часі компіляції.
 */
public class Overloading {

    /**
     * Метод createUser з одним параметром userName.
     */
    public void createUser(String userName) {

    }

    /**
     * Перевантажений метод createUser з двома параметрами: userName та email.
     */
    public void createUser(String userName, String email) {

    }

    /**
     * Перевантажений метод createUser з трьома параметрами: userName, email та age.
     */
    public void createUser(String userName, String email, Integer age) {

    }

    /**
     * Перевантажений метод createUser з двома параметрами: userName та age.
     */
    public void createUser(String userName, Integer age) {

    }

    /**
     * Перевантажений метод createUser з двома параметрами: userName та age. Тип параметра age відрізняється від інших методів.
     */
    public void createUser(String userName, byte age) {

    }

    /**
     * Перевантажений метод createUser з двома параметрами: userName та registrationDate.
     */
    public void createUser(String userName, Date registrationDate) {

    }
}