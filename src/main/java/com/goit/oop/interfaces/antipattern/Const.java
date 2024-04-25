package com.goit.oop.interfaces.antipattern;

/**
 * Інтерфейс Const, який використовується для зберігання констант.
 * Використання інтерфейсів для зберігання констант є антипатерном та поганою практикою кодування.
 * Це порушує принципи ООП, такі як інкапсуляція, оскільки константи стають глобальними та доступними для всіх класів, що реалізують цей інтерфейс.
 * Кращою практикою є зберігання констант в класах, де вони використовуються, або використання класів констант, якщо вони використовуються в багатьох місцях.
 */
public interface Const {
    String SECRET_KEY = "sdfvadcdevfedv";
}