package com.goit.oop.polimorphism.ex2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Circle implements Shape {
   private final double radius;

   @Override
   public String computeArea() {
       double area = Math.PI * Math.pow(radius, 2);
       return String.format("Circle: %10.2f", area);
   }
}
