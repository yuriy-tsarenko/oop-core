package com.goit.oop.polimorphism.ex2;

/**
 * Головний клас, який демонструє поліморфізм в Java.
 * Поліморфізм в Java - це концепція, за якої ми можемо виконувати одну дію різними способами.
 * Поліморфізм дозволяє визначити один інтерфейс та мати кілька реалізацій.
 */
public class Main {
    public static void main(String[ ] args) {
        /**
         * Створюємо масив об'єктів типу Shape, які можуть бути екземплярами різних класів (Square, Circle).
         * Це є прикладом поліморфізму.
         */
        Shape[ ] shapes = {
                new Square(10.5, 22.2),
                new Square(12.5, 12.8),
                new Square(15.1, 34.8),
                new Circle(15),
                new Circle(41.7),
                new Circle(35)};
        /**
         * Проходимося по масиву shapes та виводимо площу кожної фігури.
         * Незважаючи на те, що об'єкти можуть бути різних типів (Square, Circle), ми можемо викликати метод computeArea() для кожного з них.
         * Це тому, що обидва класи реалізують інтерфейс Shape, який визначає метод computeArea().
         */
        for (Shape shape : shapes) {
            printArea(shape);
        }
    }

    /**
     * Метод printArea, який приймає об'єкт типу Shape та виводить його площу.
     * Це є прикладом поліморфізму, оскільки ми можемо передати об'єкт будь-якого класу, який реалізує інтерфейс Shape.
     */
    private static void printArea(Shape shape) {
        System.out.println(shape.computeArea());
    }
}