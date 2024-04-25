package com.goit.oop.modifiers;

import com.goit.oop.modifiers.default_modifier.DefModifiers;
import com.goit.oop.modifiers.private_modifier.PrivateModifiers;
import com.goit.oop.modifiers.protected_modifier.ProtectedModifiers;
import com.goit.oop.modifiers.public_modifier.PublicModifiers;

public class Main {
    public static void main(String[] args) {
        PrivateModifiers privateModifiers = PrivateModifiers.instance();
        privateModifiers.setName("John");
        privateModifiers.getName();

        Long id = new PublicModifiers().id;
    }
}
