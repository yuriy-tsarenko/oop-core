package com.goit.oop.interfaces;


public class Main {
    public static void main(String[] args) {
        DemoInterface instance = new ChildClass();

        // implementation of abstract classname()
        instance.classname();

        // final parentName()
        instance.parentName();

        // static nameStatic()
        DemoInterface.nameStatic();

        //static
        String message = DemoInterface.message;
        String tokenBasicAuth = DemoInterface.tokenBasicAuth;
        double value = DemoInterface.value;
        int count = DemoInterface.count;

    }
}
