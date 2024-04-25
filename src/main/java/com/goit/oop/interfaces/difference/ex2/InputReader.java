package com.goit.oop.interfaces.difference.ex2;

import java.io.Serializable;
import java.util.Scanner;

public class InputReader implements Reader, Serializable {
    @Override
    public String read() {
        return new Scanner(System.in).nextLine();
    }
}
