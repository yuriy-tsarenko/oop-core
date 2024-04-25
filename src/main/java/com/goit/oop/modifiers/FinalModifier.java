package com.goit.oop.modifiers;

import java.util.UUID;

public class FinalModifier {

    private final String email = "example@gmail.com";

    public static void main(String[] args) {
        FinalModifier finalModifier = new FinalModifier();
        Integer number;
        number = 45;
        final Integer result = divide(number);
        final Integer secondNumber = 89;
        Integer result2 = multiply(secondNumber);
        System.out.println(result);
        System.out.println(result2);
    }

    public static Integer multiply(Integer number) {
        //
        // code
        //
           number=7;
        return number;
    }

    public static Integer divide(final Integer number) {
        //
        // code
        //
        //   number=7;
        return number;
    }

    public static String generate(final String data) {
        //
        //
        //
//        data = "changed";

        return UUID.randomUUID().toString() + data;
    }
}
