package com.goit.oop.modifiers;

import com.goit.oop.modifiers.protected_modifier.ProtectedModifiers;

import java.util.Date;
// super - це ключове слово для доступу до батьківського класу
public class ChildClass extends ProtectedModifiers {

    public Long calculateIdentifier() {
        return super.id + new Date().getTime();
    }
}
