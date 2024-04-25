package com.goit.oop.modifiers;

import java.util.UUID;

//static - не првязаний до обєкту класу
//статичні змінні зберігають в мамяті окремо і доступ можна отримати незалежно від стану класу де влни знаходяться
public class StaticModifier {
    static String name = "";

    public static void main(String[] args) {
        createToken();
        StaticModifier.name = "Kate";
    }

    public static String createToken() {
        return UUID.randomUUID().toString();
    }
}
