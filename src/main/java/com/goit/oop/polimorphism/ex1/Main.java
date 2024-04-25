package com.goit.oop.polimorphism.ex1;

import java.util.Scanner;

/**
 * Головний клас, який демонструє поліморфізм в Java.
 * Поліморфізм в Java - це концепція, за якої ми можемо виконувати одну дію різними способами.
 * Поліморфізм дозволяє визначити один інтерфейс та мати кілька реалізацій.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter type of vehicle: ");
        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.next();
        Vehicle vehicle = getVehicle(userChoice);

        System.out.println("type: " + vehicle.runEngine());
    }

    /**
     * Метод getVehicle, який повертає об'єкт типу Vehicle в залежності від вибору користувача.
     * Це демонстрація поліморфізму, оскільки ми можемо повернути різні типи об'єктів, які реалізують інтерфейс Vehicle.
     */
    private static Vehicle getVehicle(String userChoice) {
        return switch (userChoice) {
            case "Car" -> new Car();
            case "Bike" -> new Bike();
            case "Bicycle" -> new Bicycle();
            default -> throw new RuntimeException("unknown type");
        };
    }
}