package com.goit.oop.interfaces;

class ChildClass implements DemoInterface {

    @Override
    public void classname() {
        System.out.println(ChildClass.class.getName());
    }

    @Override
    public void parentName() {
        System.out.println(ChildClass.class.getSuperclass().getName());
    }
}
