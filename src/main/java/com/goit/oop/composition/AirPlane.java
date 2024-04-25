package com.goit.oop.composition;

/**
 * Клас AirPlane представляє модель літака.
 * Він містить двигун та масив пасажирів.
 * Двигун є обов'язковим компонентом при створенні літака, тоді як пасажири можуть бути додані пізніше.
 */
public class AirPlane {

   // Поле для зберігання двигуна літака
   private final Engine engine;

   // Поле для зберігання масиву пасажирів
   private Passenger[] passengers;

   /**
    * Конструктор класу AirPlane, який приймає двигун як параметр.
    * Двигун є обов'язковим компонентом при створенні літака.
    */
   public AirPlane(Engine engine) {
      this.engine = engine;
   }

   /**
    * Метод для отримання масиву пасажирів літака.
    * @return масив пасажирів літака.
    */
   public Passenger[] getPassengers() {
      return this.passengers;
   }

   /**
    * Метод для ініціалізації масиву пасажирів літака.
    * @param passengers новий масив пасажирів.
    */
   public void setPassengers(Passenger[] passengers) {
      this.passengers = passengers;
   }
}