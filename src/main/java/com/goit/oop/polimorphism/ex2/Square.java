package com.goit.oop.polimorphism.ex2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class Square implements Shape {
   private final double height;
   private final double width;

   @Override
   public String computeArea() {
       double area = height * width;
       return String.format("Square: %10.2f", area);
   }
}
